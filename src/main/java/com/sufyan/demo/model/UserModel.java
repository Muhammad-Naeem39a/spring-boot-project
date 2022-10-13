package com.sufyan.demo.model;

import javax.persistence.Column;

import com.sufyan.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserModel {
    private Long webId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    public  UserModel(User entity){
        this.webId=entity.getWebId();
        this.lastName=entity.getLastName();
        this.firstName=entity.getFirstName();
        this.email=entity.getEmail();
        this.password=entity.getPassword();
    }

    public UserModel(UserModel userModel) {

    }

    public User disassemble() {
        var entity = new User();
        entity.setWebId(this.webId);
        entity.setEmail(this.email);
        entity.setFirstName(this.firstName);
        entity.setLastName(this.lastName);
        entity.setPassword(this.password);
        return entity;
    }

    public UserModel assemble(User user) {
        return new UserModel(user);
    }
}
