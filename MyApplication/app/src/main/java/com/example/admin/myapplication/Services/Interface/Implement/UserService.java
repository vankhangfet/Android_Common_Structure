package com.example.admin.myapplication.Services.Interface.Implement;

import com.example.admin.myapplication.DTO.UserDTO;
import com.example.admin.myapplication.Entity.UserEntity;
import com.example.admin.myapplication.Exceptions.ServiceException;
import com.example.admin.myapplication.Repository.IUserRepository;
import com.example.admin.myapplication.Services.Interface.IUserService;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {

    private IUserRepository userRepository;

    @Override
    public List<UserDTO> GetAll() throws Exception {
        List<UserDTO> users = new ArrayList<>();
        try {

        }
        catch(Exception ex)
        {
            throw new Exception("Exception message");
        }

        return users;
    }

    @Override
    public UserDTO GetUserById(String Id) {
        return null;
    }
}
