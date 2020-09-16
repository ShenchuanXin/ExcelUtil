package com.scx.excelutil.model;

/**
 * @author scx
 * @date 2020-09-15 16:00
 * @Description 密码组件
 */
public class PassComponent extends FormComponent {

    static class PassOptions extends FormComponentOptions {

        private int maxlength;

        private final String dataType = "password";

        private boolean amountmoney;

        private String pattern;

        private String tips;

        public PassOptions() {
            this.maxlength = 20;
            this.amountmoney = false;
            this.pattern = "";
            this.tips = "";
        }

        public PassOptions(boolean hidden, String defaultValue, boolean disabled,
                           String placeholder, boolean required, boolean isLabelWidth,
                           int labelWidth, String width, boolean hideLabel, int maxlength,
                           boolean amountmoney, String pattern, String tips) {
            super(hidden, defaultValue, disabled, placeholder, required, isLabelWidth, labelWidth, width, hideLabel);
            this.maxlength = maxlength;
            this.amountmoney = amountmoney;
            this.pattern = pattern;
            this.tips = tips;
        }

        public int getMaxlength() {
            return maxlength;
        }

        public void setMaxlength(int maxlength) {
            this.maxlength = maxlength;
        }

        public String getDataType() {
            return dataType;
        }

        public boolean isAmountmoney() {
            return amountmoney;
        }

        public void setAmountmoney(boolean amountmoney) {
            this.amountmoney = amountmoney;
        }

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public String getTips() {
            return tips;
        }

        public void setTips(String tips) {
            this.tips = tips;
        }
    }

    @Override
    public FormComponent build(FormComponentDTO dataSource) {
        super.build(dataSource);
        this.setIcon("icon-input");
        this.setType(dataSource.getType());
        FormComponentOptions options = new PassComponent.PassOptions();
        this.setOptions(options);
        return this;
    }
}
