package com.example.service

import com.example.model.User
import com.example.model.UserCredentials

interface UserService {

    suspend fun registerUser(params:UserCredentials): User?
    suspend fun findUserByEmail(params: UserCredentials):User?
}