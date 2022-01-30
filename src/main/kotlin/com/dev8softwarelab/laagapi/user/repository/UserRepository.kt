package com.dev8softwarelab.laagapi.user.repository

import com.dev8softwarelab.laagapi.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>