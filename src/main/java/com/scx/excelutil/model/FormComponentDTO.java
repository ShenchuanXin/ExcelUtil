package com.scx.excelutil.model;

import com.scx.excelutil.util.ExcelCell;

/**
 * @author scx
 * @date 2020-09-14 17:21
 * @Description
 */
public class FormComponentDTO {

    @ExcelCell(index = 0)
    private String enName;

    @ExcelCell(index = 1)
    private String cnName;

    @ExcelCell(index = 2)
    private String dataType;

    @ExcelCell(index = 3)
    private String maxLengh;

    @ExcelCell(index = 4)
    private boolean isRequired;

    @ExcelCell(index = 5)
    private boolean isShow;

    @ExcelCell(index = 6)
    private String type;

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getMaxLengh() {
        return maxLengh;
    }

    public void setMaxLengh(String maxLengh) {
        this.maxLengh = maxLengh;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    @Override
    public String toString() {
        return "FormComponent{" +
                "enName='" + enName + '\'' +
                ", cnName='" + cnName + '\'' +
                ", type='" + type + '\'' +
                ", dataType='" + dataType + '\'' +
                ", maxLengh='" + maxLengh + '\'' +
                ", isRequired=" + isRequired +
                ", isShow=" + isShow +
                '}';
    }
}
