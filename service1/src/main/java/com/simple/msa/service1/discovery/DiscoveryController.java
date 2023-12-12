package com.simple.msa.service1.discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoveryController {

    @Autowired
    DiscoveryService discoveryService;


    @GetMapping(value = "/services")
    public List<String> getServiceList() {

        return  discoveryService.getServiceList();

    }

    @GetMapping(value = "/restTemplate/{id}")
    public String getNameByRestTemplate(
            @PathVariable String id
    ) {

        return discoveryService.getNameByRestTemplate(id);

    }

    @GetMapping(value = "/ribbon/{id}")
    public String ribbon(@PathVariable("id") String id) {

        return discoveryService.getNameByRibbon(id);

    }

    @GetMapping(value = "/feign/{id}")
    public String feign(@PathVariable("id") String id) {

        return discoveryService.getNameByFeign(id);

    }



}
