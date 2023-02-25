package com.parkhe.travels.agency.web;

import com.parkhe.travels.agency.config.ConfigProperty;
import com.parkhe.travels.agency.pojo.ApplicationProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {
    @Autowired
    private ConfigProperty property;

    @GetMapping("/props")
    public ApplicationProperty fetch() {
        System.out.println(this.property);
        return property.getProperty();
    }
}
