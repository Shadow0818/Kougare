package com.shuang.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;


//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableWebSecurity
//@EnableCaching
//public class SecurityConfig extends GlobalMethodSecurityConfiguration {

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
