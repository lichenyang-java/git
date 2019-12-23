package com.example;

import com.example.domain.User;
import com.example.mapper.Mapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybaitsdemoweb1223Application.class)
public class MybatisTest {
    @Autowired
    private Mapper mapper;
    @Test
    public void test(){
        List<User> all = mapper.findAll();
        System.out.println(all);
    }
}
