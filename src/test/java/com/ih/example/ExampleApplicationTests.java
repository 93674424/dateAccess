package com.ih.example;

import com.ih.example.Mapper.TeacherMapper;
import com.ih.example.Service.Teachers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleApplicationTests {

    @Resource
    TeacherMapper teacherMapper;

    @Test
    public void contextLoads() {
        List<Teachers> teachersList = teacherMapper.selectList(null);
        Assert.assertEquals(4,teachersList.size());
        teachersList.forEach(System.out::println);
    }

}