package com.scx.excelutil.model;

/**
 * @author scx
 * @date 2020-09-15 16:14
 * @Description
 */
public class TextComponent extends FormComponent {

    static class TextOptions extends FormComponentOptions {
        private int maxlength;

        private boolean wordLimit;

        private boolean clearable;

        private final String dataType = "text";

        private boolean dataTypeCheck;

        private String dataTypeMessage;

        private int integerbits;

        private int decimalbits;

        private String pattern;

        private boolean patternCheck;

        private String patternMessage;

        private boolean showPassword;

        private String tips;

        public TextOptions(int maxlength, boolean wordLimit, boolean clearable, boolean dataTypeCheck, String dataTypeMessage, int integerbits, int decimalbits, String pattern, boolean patternCheck, String patternMessage, boolean showPassword, String tips) {
            this.maxlength = maxlength;
            this.wordLimit = wordLimit;
            this.clearable = clearable;
            this.dataTypeCheck = dataTypeCheck;
            this.dataTypeMessage = dataTypeMessage;
            this.integerbits = integerbits;
            this.decimalbits = decimalbits;
            this.pattern = pattern;
            this.patternCheck = patternCheck;
            this.patternMessage = patternMessage;
            this.showPassword = showPassword;
            this.tips = tips;
        }

        public TextOptions() {
            super();
            this.maxlength = 10;
            this.wordLimit = false;
            this.clearable = false;
            this.dataTypeCheck = false;
            this.dataTypeMessage = "";
            this.integerbits = 1;
            this.decimalbits = 0;
            this.pattern = "";
            this.patternCheck = false;
            this.patternMessage = "";
            this.showPassword = false;
            this.tips = "";
        }

        public int getMaxlength() {
            return maxlength;
        }

        public void setMaxlength(int maxlength) {
            this.maxlength = maxlength;
        }

        public boolean isWordLimit() {
            return wordLimit;
        }

        public void setWordLimit(boolean wordLimit) {
            this.wordLimit = wordLimit;
        }

        public boolean isClearable() {
            return clearable;
        }

        public void setClearable(boolean clearable) {
            this.clearable = clearable;
        }

        public String getDataType() {
            return dataType;
        }

        public boolean isDataTypeCheck() {
            return dataTypeCheck;
        }

        public void setDataTypeCheck(boolean dataTypeCheck) {
            this.dataTypeCheck = dataTypeCheck;
        }

        public String getDataTypeMessage() {
            return dataTypeMessage;
        }

        public void setDataTypeMessage(String dataTypeMessage) {
            this.dataTypeMessage = dataTypeMessage;
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

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public boolean isPatternCheck() {
            return patternCheck;
        }

        public void setPatternCheck(boolean patternCheck) {
            this.patternCheck = patternCheck;
        }

        public String getPatternMessage() {
            return patternMessage;
        }

        public void setPatternMessage(String patternMessage) {
            this.patternMessage = patternMessage;
        }

        public boolean isShowPassword() {
            return showPassword;
        }

        public void setShowPassword(boolean showPassword) {
            this.showPassword = showPassword;
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
        FormComponentOptions options = new TextComponent.TextOptions();
        this.setOptions(options);
        return this;
    }
}
