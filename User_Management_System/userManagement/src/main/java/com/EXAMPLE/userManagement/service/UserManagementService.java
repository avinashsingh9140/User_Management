package com.EXAMPLE.userManagement.service;

import com.EXAMPLE.userManagement.model.UserManagment;
import com.EXAMPLE.userManagement.repo.IUserManagementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserManagementService {
    @Autowired
    IUserManagementRepo managementRepo;


    public String setmanagement(List<UserManagment> newuser) {
        managementRepo.saveAll(newuser);
        return "user added";

    }

    public List<UserManagment> getusermanagement() {
        return (List<UserManagment>) managementRepo.findAll();
    }

    public Optional<UserManagment> getuserbyid(Integer id) {
        return managementRepo.findById(id);

    }

    public void updateby(Integer id, UserManagment newuser) {

        UserManagment val= managementRepo.findById(id).get();
        if(val!=null){
            // for updating one by one
//            val.setUserName(newuser.getUserName());  //
//            val.getPhoneNumber(newuser.getPhoneNumber());
//            managementRepo.save(val);

            // if we want to update all once


            managementRepo.save(newuser);
        }
    }

    public String deletedbyid(Integer id) {
        managementRepo.deleteById(id);
        return "user deleted";
    }


//

}