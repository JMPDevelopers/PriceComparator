package com.jmpdev.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by HP on 2016-01-28.
 */
@Configuration
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

//   Specified initializer class registers the springSecurityFilter with application war.

// Below equivalent in XML
//    <filter>
//        <filter-name>springSecurityFilterChain</filter-name>
//        <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
//    </filter>
//
//    <filter-mapping>
//        <filter-name>springSecurityFilterChain</filter-name>
//        <url-pattern>/*</url-pattern>
//    </filter-mapping>

}

