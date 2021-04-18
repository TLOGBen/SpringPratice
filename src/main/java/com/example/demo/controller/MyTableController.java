package com.example.demo.controller;

import com.example.demo.businessModel.MytableBean;
import com.example.demo.controller.view.mytable.GetMytableVin;
import com.example.demo.controller.view.mytable.GetMytableVout;
import com.example.demo.controller.view.vo.MytableView;
import com.example.demo.facade.IMyTableFacade;
import com.example.demo.facade.bo.QueryMyTableByNameInput;
import com.example.demo.facade.bo.QueryMyTableByNameOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyTableController {
    @Autowired
    private IMyTableFacade myTableFacade;

    @GetMapping("query/{id}")
    public GetMytableVout getMyTable(@RequestBody GetMytableVin vin) {
        GetMytableVout vout = new GetMytableVout();
        QueryMyTableByNameInput input = new QueryMyTableByNameInput();
        QueryMyTableByNameOutput output;
        input.setName(vin.getId());

        output = myTableFacade.queryMyTableByName(input);
        if (output.isSuccess()) {
            vout.setSuccess(true);
            vout.setMytableView(transferToMyTableView(output.getMyTableBean()));
        } else {
            vout.setSuccess(false);
            vout.setReturnCode(output.getErrorCode());
            vout.setReturnMsg(output.getErrorMassage());
        }

        return vout;
    }

    private MytableView transferToMyTableView(MytableBean bean) {
        MytableView view = new MytableView();

        view.setId(bean.getId());
        view.setTime(bean.getTime());
        view.setName(bean.getName());
        view.setValue(bean.getValue());

        return view;
    }
}
