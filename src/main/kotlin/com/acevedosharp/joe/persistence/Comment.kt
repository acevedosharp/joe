package com.acevedosharp.joe.persistence

import javax.persistence.*

@Entity
class Comment(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(nullable = false)
    val text: String
)