package com.example.demo.facade.bo;

import com.example.demo.businessModel.baseBo.BaseInputBo;

public class QueryMyTableByNameInput extends BaseInputBo {
    private String name;

    @Override
    public boolean validateInputBo() {
        return getName() != null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
