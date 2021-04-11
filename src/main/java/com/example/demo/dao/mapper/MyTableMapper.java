package com.example.demo.dao.mapper;

import com.example.demo.dao.entity.MyTable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyTableMapper {
    @Select("SELECT * FROM mytable WHERE id = #{id}")
    MyTable findById(@Param("id") int id);

    @Insert("INSERT INTO mytable (name,value,time) value (#{name},#{value},#{time})")
    void insert(MyTable Mytable);
}
