package com.acevedosharp.joe.security

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter


@Configuration
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

    override fun configure(security: HttpSecurity) {
        security
            .httpBasic().disable()
            .formLogin().disable()
            .csrf().disable()
            .headers()
                .contentSecurityPolicy("script-src 'self'")
    }

}