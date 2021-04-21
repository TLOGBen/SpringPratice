package com.example.demo;

import com.example.demo.dao.repository.impl.MyTableRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.example.demo.DemoApplication.class)
class DemoApplicationTests {

    @Autowired
    @Qualifier("SecondaryData")
    private DataSource dataSource;

    @Autowired
    MyTableRepositoryImpl myTableRepository;


    @Test
    void createQueryTest() {
    }
}
