package com.example.admin.myapplication.Services.Interface;

import com.example.admin.myapplication.DTO.UserDTO;
import com.example.admin.myapplication.Entity.UserEntity;

import java.util.List;

public interface IUserService {
    List<UserDTO> GetAll() throws Exception;
    UserDTO GetUserById(String Id);
}
