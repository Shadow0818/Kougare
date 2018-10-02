package com.shuang.configuration;

//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//
//
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableWebSecurity
//@EnableCaching
//public class SecurityConfig {
//
//	protected void configure(final HttpSecurity http) throws Exception {
//		http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//				.authorizeRequests().antMatchers("/**").permitAll();
//	}
//	public void configure(final WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/*.html", "/*.woff", "/*.tiff", "/*woff2", "/*.svg", "/**/*.tff", "/*", "/**/*.png",
//				"/**/*.html", "/**/*.js", "/*.map", "/assets/**", "/v2/api-docs", "/swagger-ui.html",
//				"/swagger-resources", "/swagger-resources/**", "/kservice/pinguri");
//	}
//}
