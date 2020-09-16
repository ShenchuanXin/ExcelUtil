package com.scx.excelutil.model;

/**
 * @author scx
 * @date 2020-09-15 16:28
 * @Description
 */
public enum ComTypeEnum {
    PASSWORD("password"),
    AMOUNT("amount"),
    NUMBER("input"),
    SINGLETEXT("singletext"),
    DATE("date"),
    SELECT("select"),
    CARD("readcard");
    private String comType;

    ComTypeEnum(String comType) {
        this.comType = comType;
    }

    public String getComType() {
        return comType;
    }
}
