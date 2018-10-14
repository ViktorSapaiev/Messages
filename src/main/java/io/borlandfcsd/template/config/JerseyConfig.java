package io.borlandfcsd.template.config;

import io.borlandfcsd.template.controller.MessageResource;
import io.borlandfcsd.template.controller.exceptionProvider.MethodArgumentNotValidExceptionHandler;
import io.borlandfcsd.template.service.MessageService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

@Configuration
public class JerseyConfig {
    @Bean
    public MessageResource contactResource(MessageService messageService){
        return new MessageResource(messageService);
    }

    @Bean
    public ResourceConfig config(MessageResource mr){
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.register(mr);
        resourceConfig.register(MethodArgumentNotValidExceptionHandler.class);

        resourceConfig.setProperties(new LinkedHashMap<String, Object>() {{
            put(org.glassfish.jersey.server.ServerProperties.PROCESSING_RESPONSE_ERRORS_ENABLED, true);
        }});

        return resourceConfig;
    }
}
