package com.EXAMPLE.userManagement.controller.service.UserManagemnt;

import com.EXAMPLE.userManagement.model.UserManagment;
import com.EXAMPLE.userManagement.service.UserManagementService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class controller {
    @Autowired
    UserManagementService usermanagement;
//post
    @PostMapping("adduser")
    public String setmanagement(@RequestBody @Valid List<UserManagment> newuser) {
        return usermanagement.setmanagement(newuser);
    }
//getAll
    @GetMapping("getalluser")
    public List<UserManagment>getusermanagement(){
        return  usermanagement.getusermanagement();
    }
    //getmapping by id
    @GetMapping("getuser/{id}")
    public Optional<UserManagment> getuserbyid(@PathVariable Integer id){
        return  usermanagement.getuserbyid(id);
    }
//putmapping
    @PutMapping("putuser/{id}")
    public String updatebyid(@PathVariable Integer id,@RequestBody UserManagment newuser){
        usermanagement.updateby(id,newuser);
        return "user updated";
    }

    //deletebyid
    @DeleteMapping("deleteby/path/{id}")

    public String deletebyid(@PathVariable Integer id){
        return usermanagement.deletedbyid(id);
    }


}
