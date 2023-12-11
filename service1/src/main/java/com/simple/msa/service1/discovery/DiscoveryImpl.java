package com.simple.msa.service1.discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscoveryImpl implements DiscoveryService {


    @Autowired
    DiscoveryClient discoveryClient;


    @Override
    public List<String> getServiceList() {

        List<String> serviceList = new ArrayList<>();

        discoveryClient.getServices().forEach(serviceName -> {
            discoveryClient.getInstances(serviceName).forEach(serviceInstance -> {
                serviceList.add(String.format("%s:%s", serviceName, serviceInstance.getUri()));
            });
        });

        return serviceList;

    }

}
