package com.hdu.test.mapper;

import com.hdu.test.model.SchoolInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

/**
 * Created by CTWLPC on 2017/8/29.
 */
@Mapper
@Component
public interface SchoolMapper {
    @Select("SELECT * FROM school WHERE id = #{id}")
    SchoolInfo findSchoolById(@Param("id") Integer id);

    @Insert("INSERT INTO school (name,location) VALUES (#{name},#{location})")
    void insertSchool(@Param("name") String name,@Param("location") String location);

    @Select("SELECT * FROM school")
    List<SchoolInfo> findAll();

    @Delete("DELETE FROM school WHERE id = #{id}")
    void deleteSchool(@Param("id") Integer id);
}
