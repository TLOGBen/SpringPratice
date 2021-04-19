package com.example.demo;

import com.example.demo.dao.repository.impl.MyTableRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.example.demo.DemoApplication.class)
class DemoApplicationTests {

    @Autowired
    MyTableRepositoryImpl myTableRepository;

    @Test
    void createQueryTest() {
        myTableRepository.queryListOfMyTables();
    }
}
