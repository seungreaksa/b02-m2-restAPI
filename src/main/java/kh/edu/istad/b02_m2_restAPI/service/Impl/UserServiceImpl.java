package kh.edu.istad.b02_m2_restAPI.service.Impl;

import kh.edu.istad.b02_m2_restAPI.model.User;
import kh.edu.istad.b02_m2_restAPI.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.selectAll();
    }


    @Override
    public User getById(UUID id) {
        return userRepository.selectById(id)
                .orElseThrow();
    }
}