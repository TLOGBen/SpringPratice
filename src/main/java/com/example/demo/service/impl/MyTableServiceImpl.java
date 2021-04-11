package com.example.demo.service.impl;

import com.example.demo.dao.entity.MyTable;
import com.example.demo.dao.repository.MyTableRepository;
import com.example.demo.service.IMyTableService;
import com.example.demo.service.bo.QueryMyTableByNameInput;
import com.example.demo.service.bo.QueryMyTableByNameOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MyTableServiceImpl implements IMyTableService {
    @Autowired
    private MyTableRepository myTableRepository;

    @Override
    @Transactional
    public QueryMyTableByNameOutput queryMyTableByName(QueryMyTableByNameInput input) {
        QueryMyTableByNameOutput output = new QueryMyTableByNameOutput();
        boolean goNext = true;
        String errMsg = null;
        // validate
        if (input == null || !input.validateInputBo()) {
            goNext = false;
            errMsg = "缺乏必要參數";
        }

        // 1. 查詢
        MyTable myTable = new MyTable();
        if (goNext) {
            try {
                myTable = myTableRepository.findByTableName(input.getName());
                myTable.setName("bbbbb");
            } catch (Exception e) {
                goNext = false;
                errMsg = "查詢失敗: " + e;
            }
        }

        if (goNext) {
            output.setSuccess(true);
            output.setMyTable(myTable);
        } else {
            output.setSuccess(false);
            output.setErrorMassage(errMsg);
        }


        return output;
    }
}
