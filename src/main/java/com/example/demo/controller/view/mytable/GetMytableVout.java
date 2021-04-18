package com.example.demo.controller.view.mytable;

import com.example.demo.controller.view.baseVo.BaseVout;
import com.example.demo.controller.view.vo.MytableView;

public class GetMytableVout extends BaseVout {
    private MytableView mytableView;

    public MytableView getMytableView() {
        return mytableView;
    }

    public void setMytableView(MytableView mytableView) {
        this.mytableView = mytableView;
    }
}
