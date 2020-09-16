package com.scx.excelutil.model;

import java.util.ArrayList;

/**
 * @author scx
 * @date 2020-09-15 9:24
 * @Description 组件可选配置项
 */
public class FormComponentOptions {
    /**
     * 是否隐藏
     */
    private boolean hidden;
    /**
     * 默认值
     */
    private String defaultValue;
    /**
     * 是否只读
     */
    private boolean disabled;
    /**
     * 提示内容
     */
    private String placeholder;
    /**
     * 是否必填
     */
    private boolean required;
    /**
     * 标签宽度是否可配置
     */
    private boolean isLabelWidth;
    /**
     * 标签宽度
     */
    private int labelWidth;
    /**
     * 宽度
     */
    private String width;
    /**
     * 隐藏标签
     */
    private boolean hideLabel;

    public FormComponentOptions() {
        this.hidden = false;
        this.defaultValue = "";
        this.disabled = false;
        this.placeholder = "";
        this.required = false;
        this.isLabelWidth = false;
        this.labelWidth = 100;
        this.width = "100%";
        this.hideLabel = false;
    }

    public FormComponentOptions(boolean hidden, String defaultValue, boolean disabled, String placeholder,
                                boolean required, boolean isLabelWidth, int labelWidth, String width,
                                boolean hideLabel) {
        this.hidden = hidden;
        this.defaultValue = defaultValue;
        this.disabled = disabled;
        this.placeholder = placeholder;
        this.required = required;
        this.isLabelWidth = isLabelWidth;
        this.labelWidth = labelWidth;
        this.width = width;
        this.hideLabel = hideLabel;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isLabelWidth() {
        return isLabelWidth;
    }

    public void setLabelWidth(boolean labelWidth) {
        isLabelWidth = labelWidth;
    }

    public int getLabelWidth() {
        return labelWidth;
    }

    public void setLabelWidth(int labelWidth) {
        this.labelWidth = labelWidth;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public boolean isHideLabel() {
        return hideLabel;
    }

    public void setHideLabel(boolean hideLabel) {
        this.hideLabel = hideLabel;
    }

    public void init() {

        this.setHidden(false);
        this.setDefaultValue("");
        /*this.setRemoteOptions(new ArrayList<>());
        this.setMultiple(false);*/
        this.setLabelWidth(100);
        /*this.setRemote(false);*/
        this.setRequired(false);
        /*this.setShowLabel(false);
        this.setProps(null);*/
        this.setWidth("");
        /*this.setOptions(new ArrayList<>());*/
        this.setDisabled(false);
        this.setPlaceholder("");
        this.setLabelWidth(false);
    }

}
