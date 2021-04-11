package com.example.demo.facade.impl;

import com.example.demo.dao.entity.MyTable;
import com.example.demo.facade.IMyTableFacade;
import com.example.demo.facade.bo.QueryMyTableByNameInput;
import com.example.demo.facade.bo.QueryMyTableByNameOutput;
import com.example.demo.service.IMyTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyTableFacadeImpl implements IMyTableFacade {
    @Autowired
    private IMyTableService myTableService;

    @Override
    public QueryMyTableByNameOutput queryMyTableByName(QueryMyTableByNameInput input) {
        QueryMyTableByNameOutput output = new QueryMyTableByNameOutput();
        boolean goNext = true;
        String errMsg = null;
        String errCode = null;

        // validate
        if (input == null || !input.validateInputBo()) {
            goNext = false;
            errCode = "INIT_001";
            errMsg = "缺乏必要參數";
        }

        // 1. 用Name 查詢 MyTable
        MyTable myTable = new MyTable();
        if (goNext) {
            com.example.demo.service.bo.QueryMyTableByNameInput queryInput = new com.example.demo.service.bo.QueryMyTableByNameInput();
            com.example.demo.service.bo.QueryMyTableByNameOutput queryOutput;
            queryInput.setName(input.getName());

            try {
                queryOutput = myTableService.queryMyTableByName(queryInput);
                if (queryOutput.isSuccess()) {
                    myTable = queryOutput.getMyTable();
                } else {
                    goNext = false;
                    errMsg = queryOutput.getErrorMassage();
                    errCode = "MYTABLE_001";
                }
            } catch (Exception e) {
                goNext = false;
                errMsg = "查詢MyTable失敗";
                errCode = "MYTABLE_001";
            }
        }

        if (goNext) {
            output.setSuccess(true);
            output.setMyTable(myTable);
        } else {
            output.setSuccess(false);
            output.setErrorCode(errCode);
            output.setErrorMassage(errMsg);
        }

        return output;
    }

}
