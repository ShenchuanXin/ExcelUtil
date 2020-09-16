package com.scx.excelutil.model;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author scx
 * @date 2020-09-14 16:42
 * @Description 表单组件
 */
public class FormComponent {
    /**
     * 标题
     */
    private String name;
    /**
     * 数据标识
     */
    private String model;
    /**
     * 组件唯一标识
     */
    private String key;

    /**
     * 组件类型
     */
    private String type;
    /**
     * 组件图标
     */
    private String icon;

    /**
     * 隐藏条件
     */
    private String hidden;
    /**
     * 进入条件
     */
    private String enterCondition;

    /**
     * 离开条件
     */
    private String condition;

    /**
     * 取值范围
     */
    private String valueRange;
    /**
     * 离开赋值
     */
    private String assignment;
    /**
     * 启用外部服务访问
     */
    private String isRemote;
    /**
     * 外部服务访问url
     */
    private String url;
    /**
     * 外部服务访问入口数据转换脚本
     */
    private String data;
    /**
     * 外部服务访问出口数据
     */
    private String success;
    /**
     * 启动多服务访问
     */
    private boolean multiToggle;
    /**
     * 多服务访问脚本
     */
    private String multiCondition;
    /**
     * 规则校验
     */
    private List<Object> rules;

    private String tableName;

    private String tableKey;

    private String tableCode;

    private String tableModel;
    /**
     * 组件可选配置选项
     */
    private FormComponentOptions options;


    public FormComponent() {
    }

    public FormComponent(String name, String model, String key, String type, String icon, String hidden,
                         String enterCondition, String condition, String valueRange, String assignment,
                         String isRemote, String url, String data, String success, boolean multiToggle,
                         String multiCondition, List<Object> rules, FormComponentOptions options) {
        this.name = name;
        this.model = model;
        this.key = key;
        this.type = type;
        this.icon = icon;
        this.hidden = hidden;
        this.enterCondition = enterCondition;
        this.condition = condition;
        this.valueRange = valueRange;
        this.assignment = assignment;
        this.isRemote = isRemote;
        this.url = url;
        this.data = data;
        this.success = success;
        this.multiToggle = multiToggle;
        this.multiCondition = multiCondition;
        this.rules = rules;
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public String getEnterCondition() {
        return enterCondition;
    }

    public void setEnterCondition(String enterCondition) {
        this.enterCondition = enterCondition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getIsRemote() {
        return isRemote;
    }

    public void setIsRemote(String isRemote) {
        this.isRemote = isRemote;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public boolean isMultiToggle() {
        return multiToggle;
    }

    public void setMultiToggle(boolean multiToggle) {
        this.multiToggle = multiToggle;
    }

    public String getMultiCondition() {
        return multiCondition;
    }

    public void setMultiCondition(String multiCondition) {
        this.multiCondition = multiCondition;
    }

    public List<Object> getRules() {
        return rules;
    }

    public void setRules(List<Object> rules) {
        this.rules = rules;
    }

    public FormComponentOptions getOptions() {
        return options;
    }

    public void setOptions(FormComponentOptions options) {
        this.options = options;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableKey() {
        return tableKey;
    }

    public void setTableKey(String tableKey) {
        this.tableKey = tableKey;
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public String getTableModel() {
        return tableModel;
    }

    public void setTableModel(String tableModel) {
        this.tableModel = tableModel;
    }

    public FormComponent build(FormComponentDTO dataSource) {
        this.setName(dataSource.getCnName());
        this.setModel(dataSource.getEnName());
        this.setKey(String.valueOf(UUID.randomUUID()));
        this.setHidden("function main (models,utils){\n\t//models为当前表单所有model utils为扩展函数\n\t return null\n}");
        this.setEnterCondition("function main (models,utils){\n\t//models为当前表单所有model utils为扩展函数\n\treturn null\n}");
        this.setCondition("function main (models,utils,message,i){\n\t//models为当前表单所有model utils为扩展函数 message为验证错误的提示函数,i为传入cb的当前组件下标\n\tif(false){message('error','错误提示信息',i)}\n\treturn true\n}");
        this.setValueRange("");
        this.setAssignment("function main (models,utils){\n\t//models为当前表单所有model utils为扩展函数\n}");
        this.setIsRemote("function main (models,utils){\n\t//models为当前表单所有model utils为扩展函数\n\treturn false\n}");
        this.setUrl("");
        this.setData("function main (models,utils){\n\t//models为当前表单所有model utils为扩展函数\n\treturn {}\n}");
        this.setSuccess("function main (models,res,utils){\n\t//models为当前表单所有model res为请求返回数据 utils为扩展函数\n\treturn {}\n}");
        this.setMultiToggle(false);
        this.setMultiCondition("function main (models,utils,request){\n\t//models为当前表单所有model utils为扩展函数 request为axios对象\n\t//post请求示例\n\trequest.post(url,{data:123})\n\t.then(res=>{\n\t\tconsole.log(res)\n\t\trequest.post(url,{data:res.test})\n\t\t.then(response =>{console.log(response)})\n\t\t.catch(error=>{console.log(error)})\n\t})\n\t.catch(error=>{console.log(error)})\n}");
        this.setRules(new ArrayList<>());
        this.setTableCode("");
        this.setTableKey("");
        this.setTableModel("");
        this.setTableName("");
        return this;
    }
}
