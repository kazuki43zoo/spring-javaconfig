package com.springapp.web;

import com.springapp.domain.DomainConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DomainConfig.class)
public class WebApplicationConfig {

}
