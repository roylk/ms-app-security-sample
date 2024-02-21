package com.roger.customerthymleaffrontapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
                .csrf(Customizer.withDefaults())
                .authorizeHttpRequests(ar->ar.requestMatchers("/","/webjars/**","/h2-console/**").permitAll())
                .authorizeHttpRequests(ar->ar.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults())
                .logout((logout)->logout
                        .logoutSuccessUrl("/").permitAll()
                        .deleteCookies("JSESSIONID"))
                .build();
    }
}
