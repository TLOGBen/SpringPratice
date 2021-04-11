package com.example.demo.facade;

import com.example.demo.facade.bo.QueryMyTableByNameInput;
import com.example.demo.facade.bo.QueryMyTableByNameOutput;

public interface IMyTableFacade {

    QueryMyTableByNameOutput queryMyTableByName(QueryMyTableByNameInput input);
}
