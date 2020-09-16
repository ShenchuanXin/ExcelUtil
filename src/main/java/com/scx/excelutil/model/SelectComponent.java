package com.scx.excelutil.model;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;


/**
 * @author scx
 * @date 2020-09-15 14:58
 * @Description 下拉选择框
 */
public class SelectComponent extends FormComponent {

    /**
     * 是否用作级联选择器
     */
    private boolean isCascader;

    /**
     * 级联数据来源服务
     */
    private String cascaderUrl;

    /**
     * 父级组件model
     */
    private String fatherModel;

    /**
     * 入口数据转换脚本
     */
    private String requestData;

    /**
     * 出口数据转换脚本
     */
    private String responseData;


    public SelectComponent() {
    }

    public boolean isCascader() {
        return isCascader;
    }

    public void setCascader(boolean cascader) {
        isCascader = cascader;
    }

    public String getCascaderUrl() {
        return cascaderUrl;
    }

    public void setCascaderUrl(String cascaderUrl) {
        this.cascaderUrl = cascaderUrl;
    }

    public String getFatherModel() {
        return fatherModel;
    }

    public void setFatherModel(String fatherModel) {
        this.fatherModel = fatherModel;
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    static class SelectOptions extends FormComponentOptions {

        private boolean multiple;

        private boolean clearable;

        private boolean showLabel;

        private boolean remote;

        private boolean filterable;

        private List<Object> remoteOptions;

        private String remoteFunc;

        private List<Object> options;

        private Object props;

        public SelectOptions() {
            super();
            this.multiple = false;
            this.clearable = false;
            this.showLabel = false;
            this.remote = false;
            this.filterable = false;
            this.remoteOptions = new ArrayList<>();
            this.remoteFunc = "function main (request){\\n      \\t//request为axios对象\\n      \\t//post请求示例\\n      \\trequest.post(url,{data:123})\\n      \\t.then(res=>{\\n          console.log(res)\\n          //将需要赋值给组件的数组或者列表数据返回\\n          return res.body.list\\n      \\t})\\n      \\t.catch(error=>{console.log(error)})\\n      }";
            this.options = new ArrayList<>();
            this.props = JSONObject.parse("{\n" +
                    "          \"value\": \"value\",\n" +
                    "          \"label\": \"label\"\n" +
                    "        }");
        }

        public SelectOptions(boolean hidden, String defaultValue, boolean disabled, String placeholder,
                             boolean required, boolean isLabelWidth, int labelWidth,
                             String width, boolean hideLabel, boolean multiple, boolean clearable,
                             boolean showLabel, boolean remote, boolean filterable, List<Object> remoteOptions,
                             String remoteFunc, List<Object> options, Object props) {
            super(hidden, defaultValue, disabled, placeholder, required, isLabelWidth, labelWidth, width, hideLabel);
            this.multiple = multiple;
            this.clearable = clearable;
            this.showLabel = showLabel;
            this.remote = remote;
            this.filterable = filterable;
            this.remoteOptions = remoteOptions;
            this.remoteFunc = remoteFunc;
            this.options = options;
            this.props = props;
        }

        public boolean isMultiple() {
            return multiple;
        }

        public void setMultiple(boolean multiple) {
            this.multiple = multiple;
        }

        public boolean isClearable() {
            return clearable;
        }

        public void setClearable(boolean clearable) {
            this.clearable = clearable;
        }

        public boolean isShowLabel() {
            return showLabel;
        }

        public void setShowLabel(boolean showLabel) {
            this.showLabel = showLabel;
        }

        public boolean isRemote() {
            return remote;
        }

        public void setRemote(boolean remote) {
            this.remote = remote;
        }

        public boolean isFilterable() {
            return filterable;
        }

        public void setFilterable(boolean filterable) {
            this.filterable = filterable;
        }

        public List<Object> getRemoteOptions() {
            return remoteOptions;
        }

        public void setRemoteOptions(List<Object> remoteOptions) {
            this.remoteOptions = remoteOptions;
        }

        public String getRemoteFunc() {
            return remoteFunc;
        }

        public void setRemoteFunc(String remoteFunc) {
            this.remoteFunc = remoteFunc;
        }

        public List<Object> getOptions() {
            return options;
        }

        public void setOptions(List<Object> options) {
            this.options = options;
        }

        public Object getProps() {
            return props;
        }

        public void setProps(Object props) {
            this.props = props;
        }
    }

    @Override
    public FormComponent build(FormComponentDTO dataSource) {
        super.build(dataSource);
        this.setIcon("icon-select");
        this.setType(dataSource.getType());
        FormComponentOptions options = new SelectComponent.SelectOptions();
        this.setOptions(options);
        return this;
    }
}
