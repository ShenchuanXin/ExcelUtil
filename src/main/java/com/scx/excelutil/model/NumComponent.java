package com.scx.excelutil.model;

/**
 * @author scx
 * @date 2020-09-15 16:08
 * @Description
 */
public class NumComponent extends FormComponent {
    static class NumOptions extends FormComponentOptions {

        private int integerbits;

        private int decimalbits;

        private final String dataType = "integer";

        private String pattern;

        private String tips;

        public NumOptions() {
            this.integerbits = 17;
            this.decimalbits = 4;
            this.pattern = "";
            this.tips = "";
        }

        public NumOptions(boolean hidden, String defaultValue, boolean disabled, String placeholder,
                          boolean required, boolean isLabelWidth, int labelWidth, String width,
                          boolean hideLabel, int integerbits, int decimalbits, String pattern, String tips) {
            super(hidden, defaultValue, disabled, placeholder, required, isLabelWidth, labelWidth, width, hideLabel);
            this.integerbits = integerbits;
            this.decimalbits = decimalbits;
            this.pattern = pattern;
            this.tips = tips;
        }

        public int getIntegerbits() {
            return integerbits;
        }

        public void setIntegerbits(int integerbits) {
            this.integerbits = integerbits;
        }

        public int getDecimalbits() {
            return decimalbits;
        }

        public void setDecimalbits(int decimalbits) {
            this.decimalbits = decimalbits;
        }

        public String getDataType() {
            return dataType;
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
        FormComponentOptions options = new NumComponent.NumOptions();
        this.setOptions(options);
        return this;
    }
}
