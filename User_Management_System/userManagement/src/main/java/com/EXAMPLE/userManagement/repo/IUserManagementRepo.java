package com.EXAMPLE.userManagement.repo;

import com.EXAMPLE.userManagement.model.UserManagment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  IUserManagementRepo extends CrudRepository<UserManagment,Integer> {


}
