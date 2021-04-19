package com.example.demo.dao.bo;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class TableBo {
    @Id
    private Integer id;

    @Column(name = "test_id")
    private Integer testId;

    @Column(name = "mytable_id")
    private Integer mytableId;

    private Integer val;
    private String name;
    private String value;
    private Timestamp time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getMytableId() {
        return mytableId;
    }

    public void setMytableId(Integer mytableId) {
        this.mytableId = mytableId;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
