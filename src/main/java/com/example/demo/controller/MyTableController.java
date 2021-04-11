package com.example.demo.controller;

import com.example.demo.dao.mapper.MyTableMapper;
import com.example.demo.facade.IMyTableFacade;
import com.example.demo.facade.bo.QueryMyTableByNameInput;
import com.example.demo.facade.bo.QueryMyTableByNameOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyTableController {
    private final MyTableMapper mytablemapper;

    @Autowired
    private IMyTableFacade myTableFacade;

    @Autowired(required = false)
    public MyTableController(MyTableMapper mytablemapper) {
        this.mytablemapper = mytablemapper;
    }

    @GetMapping("query/{id}")
    public QueryMyTableByNameOutput getMyTable(@PathVariable String id) {
        QueryMyTableByNameInput input = new QueryMyTableByNameInput();
        QueryMyTableByNameOutput output;
        input.setName(id);

        output = myTableFacade.queryMyTableByName(input);

        return output;
    }
}
