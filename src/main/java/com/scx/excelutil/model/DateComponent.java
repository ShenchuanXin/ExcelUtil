package com.scx.excelutil.model;

/**
 * @author scx
 * @date 2020-09-15 16:20
 * @Description
 */
public class DateComponent extends FormComponent {
    static class DateOptions extends FormComponentOptions {

        private boolean readonly;

        private boolean editable;

        private boolean clearable;

        private String startPlaceholder;

        private String endPlaceholder;

        private final String type = "date";

        private String format;

        private boolean timestamp;

        public DateOptions() {
            this.readonly = false;
            this.editable = false;
            this.clearable = false;
            this.startPlaceholder = "";
            this.endPlaceholder = "";
            this.format = "yyyy-MM-dd";
            this.timestamp = false;
        }

        public DateOptions(boolean hidden, String defaultValue, boolean disabled,
                           String placeholder, boolean required, boolean isLabelWidth,
                           int labelWidth, String width, boolean hideLabel,
                           boolean readonly, boolean editable, boolean clearable,
                           String startPlaceholder, String endPlaceholder, String format, boolean timestamp) {
            super(hidden, defaultValue, disabled, placeholder, required, isLabelWidth, labelWidth, width, hideLabel);
            this.readonly = readonly;
            this.editable = editable;
            this.clearable = clearable;
            this.startPlaceholder = startPlaceholder;
            this.endPlaceholder = endPlaceholder;
            this.format = format;
            this.timestamp = timestamp;
        }

        public boolean isReadonly() {
            return readonly;
        }

        public void setReadonly(boolean readonly) {
            this.readonly = readonly;
        }

        public boolean isEditable() {
            return editable;
        }

        public void setEditable(boolean editable) {
            this.editable = editable;
        }

        public boolean isClearable() {
            return clearable;
        }

        public void setClearable(boolean clearable) {
            this.clearable = clearable;
        }

        public String getStartPlaceholder() {
            return startPlaceholder;
        }

        public void setStartPlaceholder(String startPlaceholder) {
            this.startPlaceholder = startPlaceholder;
        }

        public String getEndPlaceholder() {
            return endPlaceholder;
        }

        public void setEndPlaceholder(String endPlaceholder) {
            this.endPlaceholder = endPlaceholder;
        }

        public String getType() {
            return type;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public boolean isTimestamp() {
            return timestamp;
        }

        public void setTimestamp(boolean timestamp) {
            this.timestamp = timestamp;
        }
    }

    @Override
    public FormComponent build(FormComponentDTO dataSource) {
        super.build(dataSource);
        this.setIcon("icon-date");
        this.setType(dataSource.getType());
        FormComponentOptions options = new DateComponent.DateOptions();
        this.setOptions(options);
        return this;
    }
}
