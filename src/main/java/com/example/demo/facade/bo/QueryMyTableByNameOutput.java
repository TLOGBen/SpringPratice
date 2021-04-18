package com.example.demo.facade.bo;

import com.example.demo.businessModel.MytableBean;
import com.example.demo.businessModel.baseBo.BaseOutputBo;

public class QueryMyTableByNameOutput extends BaseOutputBo {
    private MytableBean myTableBean;

    public MytableBean getMyTableBean() {
        return myTableBean;
    }

    public void setMyTableBean(MytableBean myTableBean) {
        this.myTableBean = myTableBean;
    }
}
