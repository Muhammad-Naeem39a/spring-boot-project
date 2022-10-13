package com.sufyan.demo.service.Impl;

import com.sufyan.demo.model.UserModel;
import com.sufyan.demo.repository.UserRepository;
import com.sufyan.demo.service.UserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @NonNull
    @Autowired
    UserRepository userRepository;
    @Override
    public UserModel addUser(UserModel userModel) {
        var user = userModel.disassemble();
        return new UserModel(userRepository.save(user));
    }

    @Override
    public Page<UserModel> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable).map(UserModel::new);
    }

    @Override
    public UserModel updateClient(UserModel usermodel, Long clientId) {
        return null;
    }

    @Override
    public Boolean deleteClient(Long clientId) {
        return null;
    }
}
