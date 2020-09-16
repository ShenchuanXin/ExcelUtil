package com.scx.excelutil.model;

/**
 * @author scx
 * @date 2020-09-15 16:04
 * @Description
 */
public class AmountComponent extends FormComponent {

    static class AmountOptions extends FormComponentOptions {

        private int maxlength;

        private final String dataType = "amount";

        private final boolean amountmoney = true;

        private int decimal;

        private String pattern;

        private String tips;

        public AmountOptions() {
            this.maxlength = 20;
            this.decimal = 2;
            this.pattern = "";
            this.tips = "";
        }

        public AmountOptions(boolean hidden, String defaultValue, boolean disabled, String placeholder,
                             boolean required, boolean isLabelWidth, int labelWidth, String width,
                             boolean hideLabel, int maxlength, int decimal, String pattern, String tips) {
            super(hidden, defaultValue, disabled, placeholder, required, isLabelWidth, labelWidth, width, hideLabel);
            this.maxlength = maxlength;
            this.decimal = decimal;
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

        public int getDecimal() {
            return decimal;
        }

        public void setDecimal(int decimal) {
            this.decimal = decimal;
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
        FormComponentOptions options = new AmountOptions();
        this.setOptions(options);
        return this;
    }
}
