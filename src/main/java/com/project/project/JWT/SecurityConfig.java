package com.project.project.JWT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/stream/**").permitAll()  // ✅ Allow public access
                        .anyRequest().authenticated()  // Secure other endpoints
                )
                .formLogin().disable()
                .httpBasic();

        return http.build();
    }
}
