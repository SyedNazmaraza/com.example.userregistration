package com.example.service

import com.example.model.User
import com.example.model.UserCredentials

class UserServiceImpl : UserService {
    override suspend fun registerUser(params: UserCredentials): User {

    }

    override suspend fun findUserByEmail(params: UserCredentials): User? {


    }
}