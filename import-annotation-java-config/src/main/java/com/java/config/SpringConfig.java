package com.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({StaffConfig.class,StudentConfig.class})
public class SpringConfig {

}
