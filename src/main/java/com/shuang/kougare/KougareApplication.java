package com.shuang.kougare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @configuration: This annotation is used on classes that define
 *                 beans. @Configuration is an analog for an XML configuration
 *                 file – it is configuration using Java classes. A Java class
 *                 annotated with @Configuration is a configuration by itself
 *                 and will have methods to instantiate and configure the
 *                 dependencies.
 * @ComponentScan: This annotation is used with the @Configuration annotation to
 *                 allow Spring to know the packages to scan for annotated
 *                 components. @ComponentScan is also used to specify base
 *                 packages using basePackageClasses or basePackage attributes
 *                 to scan. If specific packages are not defined, scanning will
 *                 occur from the package of the class that declares this
 *                 annotation.
 * @EnableAutoConfiguration: This annotation is usually placed on the main
 *                           application class. The @EnableAutoConfiguration
 *                           annotation implicitly defines a base “search
 *                           package”. This annotation tells Spring Boot to
 *                           start adding beans based on classpath settings,
 *                           other beans, and various property settings.
 * 
 *these three annotation sum up to @SpringBootApplication
 * 
 * @author Shuang
 *
 */

@SpringBootApplication
public class KougareApplication {

	public static void main(String[] args) {
		SpringApplication.run(KougareApplication.class, args);
	}
}
