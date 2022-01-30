package com.dev8softwarelab.laagapi.user.controller

import com.dev8softwarelab.laagapi.user.domain.User
import com.dev8softwarelab.laagapi.user.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class UserController(private val userRepository: UserRepository) {

    @GetMapping("/users")
    fun getAllUsers(): List<User> =
        userRepository.findAll()

}