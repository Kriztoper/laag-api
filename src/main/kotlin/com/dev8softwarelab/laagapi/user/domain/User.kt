package com.dev8softwarelab.laagapi.user.domain

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class User (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @get: NotBlank
    val username: String = ""

)