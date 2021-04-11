package com.example.demo.dao.repository;

import com.example.demo.dao.entity.MyTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTableRepository extends JpaRepository<MyTable, Long> {

    @Query(value = "SELECT * FROM MyTable WHERE name = :name", nativeQuery = true)
    MyTable findByTableName(@Param("name") String name);
}
