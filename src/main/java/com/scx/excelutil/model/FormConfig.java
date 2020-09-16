package com.scx.excelutil.model;

/**
 * @author scx
 * @date 2020-09-15 10:14
 * @Description
 */
public class FormConfig {
    private String size;
    private String labelPosition;
    private int labelWidth;

    public FormConfig(String size, String labelPosition, int labelWidth) {
        this.size = size;
        this.labelPosition = labelPosition;
        this.labelWidth = labelWidth;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLabelPosition() {
        return labelPosition;
    }

    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }

    public int getLabelWidth() {
        return labelWidth;
    }

    public void setLabelWidth(int labelWidth) {
        this.labelWidth = labelWidth;
    }
}
