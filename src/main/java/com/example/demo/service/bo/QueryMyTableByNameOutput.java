package com.example.demo.service.bo;

import com.example.demo.businessModel.baseBo.BaseOutputBo;
import com.example.demo.dao.entity.MyTable;

public class QueryMyTableByNameOutput extends BaseOutputBo {
    private MyTable myTable;

    public MyTable getMyTable() {
        return myTable;
    }

    public void setMyTable(MyTable myTable) {
        this.myTable = myTable;
    }
}
