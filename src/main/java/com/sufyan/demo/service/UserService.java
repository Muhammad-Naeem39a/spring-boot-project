package com.sufyan.demo.service;

import com.sufyan.demo.entity.User;
import com.sufyan.demo.model.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserModel addUser(UserModel userModel);

    Page<UserModel> getAllUsers(Pageable pageable);


    UserModel updateClient (UserModel usermodel, Long clientId);


    Boolean deleteClient(Long clientId);
}
