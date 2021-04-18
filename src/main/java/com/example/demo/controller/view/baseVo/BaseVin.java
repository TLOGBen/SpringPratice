package com.example.demo.controller.view.baseVo;

public abstract class BaseVin {
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    private String defaultValue;

}
