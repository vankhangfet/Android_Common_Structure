package com.example.admin.myapplication.Repository;

import com.example.admin.myapplication.Entity.UserEntity;

import java.util.List;

public interface IUserRepository extends BaseRepository {
       List<UserEntity> GetAllUser();
       UserEntity GetUserById(String id);
       void Insert(UserEntity oUser);
       int Delete(String id);
       int Update(UserEntity oUser);
}
