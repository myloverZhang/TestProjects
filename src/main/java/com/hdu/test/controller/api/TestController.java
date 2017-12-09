package com.hdu.test.controller.api;

import com.hdu.test.mapper.SchoolMapper;
import com.hdu.test.model.Params;
import com.hdu.test.model.SchoolInfo;
import com.hdu.test.model.SchoolParams;
import com.hdu.test.model.StudentsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by CTWLPC on 2017/8/28.
 */
@RestController
@RequestMapping(value = "/api/test")
@EnableTransactionManagement
public class TestController {


    private SchoolMapper schoolMapper;

    @Autowired
    public TestController(SchoolMapper schoolMapper) {
        this.schoolMapper = schoolMapper;
    }

    @PostMapping(value = "/list")
    public StudentsInfo listStudents(@RequestBody Params params){
        System.out.println(params.toString());
        return new StudentsInfo("shusf",23);
    }

    @GetMapping(value = "findSchool")
    public SchoolInfo findSchoolById(@RequestParam(value = "id",required = true) int id,@RequestParam(value = "name",required = false) String name){
        System.out.println(String.valueOf(id));
        System.out.println("./.  fds...fsaf..ffsf...hhhh......");
        return schoolMapper.findSchoolById(id);
    }
    @PostMapping(value = "addSchool")
    public void addSchool(@RequestBody SchoolParams params) {
        System.out.println(String.format("%s,%s",params.getName(),params.getLocation()));
        schoolMapper.insertSchool(params.getName(),params.getLocation());
    }

    @GetMapping(value = "/listAll")
    public List<SchoolInfo> listAllSchool(){
        return schoolMapper.findAll();
    }

    @PutMapping(value = "/put")
    public void testPut(@RequestBody SchoolParams params){
        System.out.println(params.toString());
    }

    @DeleteMapping(value = "/delete")
    public String testDelete(@RequestParam(value = "id") Integer id){
        System.out.println(id);
        schoolMapper.deleteSchool(id);
        return "delete success";
    }

    /**
     * 事物测试
     * @return
     */
    @PostMapping(value = "/mytransaction")
    @Transactional
    public String transaction(){
        testDelete(1);
        int i = 3 / 0;
        SchoolParams schoolParams = new SchoolParams();
        schoolParams.setName("one");
        schoolParams.setLocation("oneone");
        addSchool(schoolParams);
        return "success";
    }
}
