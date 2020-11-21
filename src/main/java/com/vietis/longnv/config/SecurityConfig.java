package com.vietis.longnv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.vietis.longnv.filter_handler.CustomAccessDeniedHandler;
import com.vietis.longnv.filter_handler.JwtAuthenticationTokenFilter;
import com.vietis.longnv.filter_handler.RestAuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() throws Exception {

		JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter = new JwtAuthenticationTokenFilter();
		jwtAuthenticationTokenFilter.setAuthenticationManager(authenticationManager());
		return jwtAuthenticationTokenFilter;

	}

	@Bean
	public RestAuthenticationEntryPoint restAuthenticationEntryPoint() {

		return new RestAuthenticationEntryPoint();

	}

	@Bean
	public CustomAccessDeniedHandler customAccessDeniedHandler() {
		return new CustomAccessDeniedHandler();
	}

	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {

		return super.authenticationManager();
	}

	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.authorizeRequests().antMatchers("/quiz/login","/quiz/logout").permitAll();
		
		httpSecurity.csrf().ignoringAntMatchers("/quiz/**");
		httpSecurity.antMatcher("/quiz/**")
				.httpBasic().authenticationEntryPoint(restAuthenticationEntryPoint()).and()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()		
				.antMatchers(HttpMethod.GET,"/quiz/admin/**").access("hasRole('ROLE_ADMIN')")
				.antMatchers(HttpMethod.POST,"/quiz/admin/**").access("hasRole('ROLE_ADMIN')")
				.antMatchers(HttpMethod.PUT,"/quiz/admin/**").access("hasRole('ROLE_ADMIN')")
				.antMatchers(HttpMethod.DELETE,"/quiz/admin/**").access("hasRole('ROLE_ADMIN')")
				
				
				.antMatchers(HttpMethod.GET,"/quiz/teacher/**").access("hasRole('ROLE_TEACHER')")
				.antMatchers(HttpMethod.POST,"/quiz/teacher/**").access("hasRole('ROLE_TEACHER')")
				.antMatchers(HttpMethod.PUT,"/quiz/teacher/**").access("hasRole('ROLE_TEACHER')")
				.antMatchers(HttpMethod.DELETE,"/quiz/teacher/**").access("hasRole('ROLE_TEACHER')")
				
				.antMatchers(HttpMethod.GET,"/quiz/student/**").access("hasRole('ROLE_STUDENT')")
				.antMatchers(HttpMethod.POST,"/quiz/student/**").access("hasRole('ROLE_STUDENT')")
				.antMatchers(HttpMethod.PUT,"/quiz/student/**").access("hasRole('ROLE_STUDENT')")
				.antMatchers(HttpMethod.DELETE,"/quiz/student/**").access("hasRole('ROLE_STUDENT')")
				
				
				.and()
				.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class)
				.exceptionHandling().accessDeniedHandler(customAccessDeniedHandler());
		
//		httpSecurity.csrf().ignoringAntMatchers("/admin/**");
//		httpSecurity.antMatcher("/admin/**")
//				.httpBasic().authenticationEntryPoint(restAuthenticationEntryPoint()).and()
//				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()		
//				.antMatchers(HttpMethod.GET,"/admin/**").access("hasRole('ROLE_ADMIN')")
//				.antMatchers(HttpMethod.POST,"/admin/**").access("hasRole('ROLE_ADMIN')")
//				.antMatchers(HttpMethod.PUT,"/admin/**").access("hasRole('ROLE_ADMIN')")
//				.antMatchers(HttpMethod.DELETE,"/admin/**").access("hasRole('ROLE_ADMIN')").and()
//				.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class)
//				.exceptionHandling().accessDeniedHandler(customAccessDeniedHandler());
//		
//		httpSecurity.csrf().ignoringAntMatchers("/teacher/**");
//		httpSecurity.antMatcher("/teacher/**").httpBasic().authenticationEntryPoint(restAuthenticationEntryPoint()).and()
//				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
//				.antMatchers(HttpMethod.GET,"/teacher/**").access("hasRole('ROLE_TEACHER')")
//				.antMatchers(HttpMethod.POST,"/teacher/**").access("hasRole('ROLE_TEACHER')")
//				.antMatchers(HttpMethod.PUT,"/teacher/**").access("hasRole('ROLE_TEACHER')")
//				.antMatchers(HttpMethod.DELETE,"/teacher/**").access("hasRole('ROLE_TEACHER')").and()
//				.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class)
//				.exceptionHandling().accessDeniedHandler(customAccessDeniedHandler());
//
//		httpSecurity.csrf().ignoringAntMatchers("/student/**");
//		httpSecurity.antMatcher("/student/**").httpBasic().authenticationEntryPoint(restAuthenticationEntryPoint()).and()
//				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
//				.antMatchers(HttpMethod.GET,"/student/**").access("hasRole('ROLE_STUDENT')")
//				.antMatchers(HttpMethod.POST,"/student/**").access("hasRole('ROLE_STUDENT')")
//				.antMatchers(HttpMethod.PUT,"/student/**").access("hasRole('ROLE_STUDENT')")
//				.antMatchers(HttpMethod.DELETE,"/student/**").access("hasRole('ROLE_STUDENT')").and()
//				.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class)
//				.exceptionHandling().accessDeniedHandler(customAccessDeniedHandler());
	}
}
