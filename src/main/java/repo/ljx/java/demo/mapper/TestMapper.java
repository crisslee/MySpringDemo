package main.java.repo.ljx.java.demo.controller.mapper;

import main.java.repo.ljx.java.demo.controller.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TestMapper {
    ArrayList<User> getAllUsers();
}
