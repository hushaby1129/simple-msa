package com.simple.msa.service1.discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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


}
