//package com.project.project.JWT;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/api/stream/**").permitAll() // Allow public API
//                        .requestMatchers("/public/**").permitAll() // Allow static resources
//                        .requestMatchers("/files/**").permitAll() // Allow everything (for testing)
//                        .anyRequest().authenticated()
//                )
//                .csrf(csrf -> csrf.disable()) // Disable CSRF if needed
//                .formLogin(login -> login.disable()) // Disable login form
//                .httpBasic(basic -> basic.disable()); // Disable basic auth
//
//        return http.build();
//    }
//}
