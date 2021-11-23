package com.Api.REST.repositories;

import com.Api.REST.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    ArrayList<UserModel> findByPropiedades(int propiedades);
    //public abstract ArrayList<UserModel> findByEmail(String email);
}

