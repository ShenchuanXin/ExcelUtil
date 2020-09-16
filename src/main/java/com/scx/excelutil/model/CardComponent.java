package com.scx.excelutil.model;

/**
 * @author scx
 * @date 2020-09-15 16:23
 * @Description
 */
public class CardComponent extends FormComponent {

    static class CardOptions extends FormComponentOptions {

        /**
         * 是否启用外设
         */
        private boolean ifperipheral;

        private String cardType;

        private final String dataType = "string";

        private String decimal;

        private String pattern;

        private String tips;

        public CardOptions() {
            this.ifperipheral = false;
            this.cardType = "01";
            this.decimal = "";
            this.pattern = "";
            this.tips = "";
        }

        public CardOptions(boolean hidden, String defaultValue, boolean disabled, String placeholder,
                           boolean required, boolean isLabelWidth, int labelWidth, String width,
                           boolean hideLabel, boolean ifperipheral, String cardType,
                           String decimal, String pattern, String tips) {
            super(hidden, defaultValue, disabled, placeholder, required, isLabelWidth, labelWidth, width, hideLabel);
            this.ifperipheral = ifperipheral;
            this.cardType = cardType;
            this.decimal = decimal;
            this.pattern = pattern;
            this.tips = tips;
        }

        public boolean isIfperipheral() {
            return ifperipheral;
        }

        public void setIfperipheral(boolean ifperipheral) {
            this.ifperipheral = ifperipheral;
        }

        public String getCardType() {
            return cardType;
        }

        public void setCardType(String cardType) {
            this.cardType = cardType;
        }

        public String getDataType() {
            return dataType;
        }

        public String getDecimal() {
            return decimal;
        }

        public void setDecimal(String decimal) {
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
        FormComponentOptions options = new CardComponent.CardOptions();
        this.setOptions(options);
        return this;
    }
}
