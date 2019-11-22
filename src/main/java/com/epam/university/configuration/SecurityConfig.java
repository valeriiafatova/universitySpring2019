package com.epam.university.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
                http
                        .csrf().disable()
                        .authorizeRequests()
                        .antMatchers("/", "/index", "/css/**", "/js/**", "/img/**", "/fonts/**", "/scss/**", "/vendors/**")
                        .permitAll()
                        .anyRequest().authenticated()
                        .and()
                        .httpBasic();
        }

        @Bean
        @Override
        public UserDetailsService userDetailsService() {
                List<UserDetails> users = new ArrayList<>();
                users.add(User.withDefaultPasswordEncoder().username("admin").password("nimda").roles("USER", "ADMIN").build());
                users.add(User.withDefaultPasswordEncoder().username("user").password("nimda").roles("USER").build());
                return new InMemoryUserDetailsManager(users);
        }
}
