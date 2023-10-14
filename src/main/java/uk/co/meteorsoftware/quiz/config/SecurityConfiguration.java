package uk.co.meteorsoftware.quiz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/index/**").permitAll()
                        .requestMatchers("/welcome/**").permitAll()
                        .requestMatchers("/login/**").permitAll()
                        .requestMatchers("/js/**").permitAll()
                        .requestMatchers("/css/**").permitAll()
                        .requestMatchers("/img/**").permitAll()
                        .anyRequest().authenticated()
                );
        http.csrf(csrf -> csrf.disable());
        http
                .formLogin(form -> {
                    form.loginPage("/login").permitAll();
                    form.defaultSuccessUrl("/dashboard", true);
                });
        // Todo - add logout function
        return http.build();
    }


}
