package com.simple.msa.service1.restCommunicator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestTemplateClientCommunicator {


    @Autowired
    private DiscoveryClient discoveryClient;


    public String getName(String id) {

        RestTemplate restTemplate = new RestTemplate();
        List<ServiceInstance> instanceList = discoveryClient.getInstances("service2");

        if (instanceList.isEmpty()) {
            return null;
        }

        String serviceUri = String.format("%s/name/%s", instanceList.get(0).getUri().toString(), id);

        ResponseEntity<String> restExchange = restTemplate.exchange(
                serviceUri,
                HttpMethod.GET,
                null,
                String.class,
                id
        );

        return id + " is " + restExchange.getBody();

    }

}
