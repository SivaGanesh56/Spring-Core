package com.phenom.org.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService
{
    private UserRepo userRepo;
    @Autowired
    public void setUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void save(){
        userRepo.save();
    }
}
