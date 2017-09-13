package com.example.OneRoof.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.sql.DataSource;
import java.util.Arrays;

/**
 * Created by Ethan on 9/12/17.
 */
@Configuration
//@Order(Ordered.HIGHEST_PRECEDENCE)
public class BasicAuthConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    OAuth2ClientContext oAuth2ClientContext;

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        http.authorizeRequests().antMatchers(HttpMethod.OPTIONS).permitAll();

//        http
//                .authorizeRequests()
//                    .antMatchers("/", "/newuser", "/signup", "/api", "/api/*").permitAll()
//                    .antMatchers("/admin").hasRole("ADMIN")
//                    .antMatchers("/user").hasRole("USER")
//                    .anyRequest().authenticated()
//                    .and()
//                .cors()
//                    .and()
//                .httpBasic()
//                    .and()
//                .csrf()
//                    .disable()
//                .logout()
//                    .permitAll()
//                    .logoutSuccessUrl("/login");
        http
                .cors().and()
                .csrf().disable()
                .httpBasic().and()
                .authorizeRequests().anyRequest().authenticated();


    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(this.dataSource)
                .usersByUsernameQuery("SELECT email, password, isadmin FROM appuser WHERE email = ?")
                .authoritiesByUsernameQuery("SELECT email, authority FROM authority WHERE email = ?");
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:8080"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

}
