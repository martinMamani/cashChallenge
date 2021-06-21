package com.mpm.cashApiRestFul.repositories;

import com.mpm.cashApiRestFul.models.UserModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long>{
    
}