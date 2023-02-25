package com.parkhe.travels.agency.config;

import com.parkhe.travels.agency.pojo.ApplicationProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("service-secret")
public class ConfigProperty {
    private ApplicationProperty property;

    public ApplicationProperty getProperty() {
        return property;
    }

    public void setProperty(ApplicationProperty property) {
        this.property = property;
    }
}
