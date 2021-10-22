package com.acevedosharp.joe.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepo: JpaRepository<Comment, Long>