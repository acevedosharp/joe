package com.acevedosharp.joe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JoeApplication

fun main(args: Array<String>) {
	runApplication<JoeApplication>(*args)
}
