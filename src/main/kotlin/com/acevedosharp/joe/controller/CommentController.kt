package com.acevedosharp.joe.controller

import com.acevedosharp.joe.persistence.Comment
import com.acevedosharp.joe.persistence.CommentRepo
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RequestMapping("/comments")
@Controller
class CommentController( private val commentRepo: CommentRepo ) {

    class PostCommentRequest(
        val text: String
    )

    @PostMapping
    @ResponseBody
    fun postComment(@RequestBody postCommentRequest: PostCommentRequest): ResponseEntity<String> {
        try {
            commentRepo.save(
                Comment(
                    id = null,
                    text = postCommentRequest.text
                )
            )
        } catch (e: RuntimeException) {
            return ResponseEntity.internalServerError().body(e.message!!)
        }
        return ResponseEntity.ok("Ok")
    }

    @GetMapping
    fun getCommentsView(model: Model): String {
        model.addAttribute("commentsList", commentRepo.findAll())
        return "comments"
    }
}