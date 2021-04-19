package com.example.demo.dao.repository.impl;

import com.example.demo.dao.bo.TableBo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository

public class MyTableRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;

    public List<TableBo> queryListOfMyTables() {
        List<TableBo> result = new ArrayList<>();

        Query query = entityManager.createNativeQuery(
                "SELECT * FROM MyTable m, test_ta t WHERE m.id = '1' and t.test_id = m.id"
                , TableBo.class);

        result = query.getResultList();

        return result;
    }

}
