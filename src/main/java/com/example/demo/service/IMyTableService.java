package com.example.demo.service;

import com.example.demo.service.bo.QueryMyTableByNameInput;
import com.example.demo.service.bo.QueryMyTableByNameOutput;

public interface IMyTableService {
    QueryMyTableByNameOutput queryMyTableByName(QueryMyTableByNameInput input);
}
