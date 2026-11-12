package kh.edu.istad.b02_m2_restAPI.service.Impl;

import kh.edu.istad.b02_m2_restAPI.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // YOUR LOGIC
    List<User> getAll();

    User getById(UUID id);

}