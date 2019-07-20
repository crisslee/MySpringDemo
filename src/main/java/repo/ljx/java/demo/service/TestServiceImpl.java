package main.java.repo.ljx.java.demo.controller.service;

import main.java.repo.ljx.java.demo.controller.mapper.TestMapper;
import main.java.repo.ljx.java.demo.controller.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class TestServiceImpl implements TestService {//必须用implements关键字指定这个实现类要实现那个接口
    @Autowired
    private TestMapper testMapper;

    @Override
    public ArrayList<User> getAllUsers(){
        return testMapper.getAllUsers();
    }
}
