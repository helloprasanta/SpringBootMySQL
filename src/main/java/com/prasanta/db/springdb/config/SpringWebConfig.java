package com.prasanta.db.springdb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//import org.service.utility.json.JsonUtil;

@EnableWebMvc
@Configuration
public class SpringWebConfig extends WebMvcConfigurerAdapter {


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
        super.configureDefaultServletHandling(configurer);
    }


    private static final Long MAX_FILE_SIZE = 1024L * 1024L * 25L;


        @Override
        public void addCorsMappings(final CorsRegistry registry) {
            registry.addMapping("/**").allowedOrigins("*")
                    .allowedHeaders("origin", "content-type", "accept", "authorization")
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD").allowCredentials(true);

    }


}