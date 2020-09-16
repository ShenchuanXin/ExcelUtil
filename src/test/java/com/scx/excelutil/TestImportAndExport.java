package com.scx.excelutil;

import com.alibaba.fastjson.JSONObject;
import com.scx.excelutil.model.*;
import com.scx.excelutil.util.ExcelLogs;
import com.scx.excelutil.util.ExcelUtil;
import com.scx.excelutil.util.FormComponentFactory;
import org.junit.Test;

import java.io.*;
import java.util.*;

/**
 * @author scx
 * @date 2020-09-14 16:22
 * @Description
 */
public class TestImportAndExport {
    /**
     * 导入Xls,保存为json
     *
     * @throws FileNotFoundException
     */
    @Test
    public void importXls() throws FileNotFoundException {
        File f = new File("src\\main\\resources\\excel\\import.xlsx");
        InputStream inputStream = new FileInputStream(f);

        ExcelLogs logs = new ExcelLogs();
        Collection<FormComponentDTO> importExcel = ExcelUtil.importExcel(FormComponentDTO.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs, 0);
        System.out.println(JSONObject.toJSONString(importExcel));
        List<FormComponent> componentList = new ArrayList<>();
        for (FormComponentDTO dto : Objects.requireNonNull(importExcel)) {
            FormComponent fc = new FormComponent();
            fc.setModel(dto.getEnName());
            fc.setName(dto.getCnName());
            fc.setType(dto.getType());
            if (dto.getType().toLowerCase().equals("select")) {
                fc.setIcon("icon-select");
            } else {
                fc.setIcon("icon-input");
            }
            FormComponentOptions fco = new FormComponentOptions();
            fco.init();
            fco.setRequired(dto.isRequired());
            fco.setHidden(dto.isShow());
            fc.setOptions(fco);
            componentList.add(fc);
        }

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("extendDetail", "function main (){\n}");
        dataMap.put("list", componentList);
        dataMap.put("config", new FormConfig("small", "right", 100));
        System.out.println(JSONObject.toJSONString(dataMap));
    }

    /**
     * 导入Xlsx
     *
     * @throws FileNotFoundException
     */
    @Test
    public void importXlsx() throws FileNotFoundException {
        File f = new File("src/test/resources/test.xlsx");
        InputStream inputStream = new FileInputStream(f);

        ExcelLogs logs = new ExcelLogs();
        Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs, 0);

        for (Map m : importExcel) {
            System.out.println(m);
        }
    }

    /**
     * （bean）导出excel
     *
     * @throws IOException
     */
    @Test
    public void exportXls() throws IOException {
        //用排序的Map且Map的键应与ExcelCell注解的index对应
        Map<String, String> map = new LinkedHashMap<>();
        map.put("a", "姓名");
        map.put("b", "年龄");
        map.put("c", "性别");
        map.put("d", "出生日期");
        Collection<Object> dataset = new ArrayList<Object>();
        dataset.add(new Model("", "", "", null));
        dataset.add(new Model(null, null, null, null));
        dataset.add(new Model("王五", "34", "男", new Date()));
        File f = new File("test.xls");
        OutputStream out = new FileOutputStream(f);

        ExcelUtil.exportExcel(map, dataset, out);
        out.close();
    }

    @Test
    public void mapExportXls() throws IOException {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", "");
        map.put("age", "");
        map.put("birthday", "");
        map.put("sex", "");
        Map<String, Object> map2 = new LinkedHashMap<String, Object>();
        map2.put("name", "测试是否是中文长度不能自动宽度.测试是否是中文长度不能自动宽度.");
        map2.put("age", null);
        map2.put("sex", null);
        map.put("birthday", null);
        Map<String, Object> map3 = new LinkedHashMap<String, Object>();
        map3.put("name", "张三");
        map3.put("age", 12);
        map3.put("sex", "男");
        map3.put("birthday", new Date());
        list.add(map);
        list.add(map2);
        list.add(map3);
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("name", "姓名");
        map1.put("age", "年龄");
        map1.put("birthday", "出生日期");
        map1.put("sex", "性别");
        File f = new File("test.xls");
        OutputStream out = new FileOutputStream(f);
        ExcelUtil.exportExcel(map1, list, out);
        out.close();
    }


    @Test
    public void importXlsOther() throws FileNotFoundException {
        File f = new File("src\\main\\resources\\excel\\import.xlsx");
        InputStream inputStream = new FileInputStream(f);

        ExcelLogs logs = new ExcelLogs();
        Collection<FormComponentDTO> importExcel = ExcelUtil.importExcel(FormComponentDTO.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs, 0);

        System.out.println(JSONObject.toJSONString(importExcel));

        List<FormComponent> componentList = new ArrayList<>();
        for (FormComponentDTO dto : Objects.requireNonNull(importExcel)) {
            FormComponent fc = FormComponentFactory.getComponentByType(dto);
            componentList.add(fc);
        }

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("extendDetail", "function main (){\n}");
        dataMap.put("list", componentList);
        dataMap.put("config", new FormConfig("small", "right", 100));
        System.out.println(JSONObject.toJSONString(dataMap));
    }
}
