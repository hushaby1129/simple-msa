package com.simple.msa.service1.discovery;

import com.simple.msa.service1.restCommunicator.FeignClientCommunicator;
import com.simple.msa.service1.restCommunicator.RestTemplateClientCommunicator;
import com.simple.msa.service1.restCommunicator.RibbonClientCommunicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscoveryImpl implements DiscoveryService {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    RestTemplateClientCommunicator restTemplateClientCommunicator;

    @Autowired
    RibbonClientCommunicator ribbonClientCommunicator;

    @Autowired
    FeignClientCommunicator feignClientCommunicator;


    @Override
    public List<String> getServiceList() {

        List<String> serviceList = new ArrayList<>();

        discoveryClient.getServices().forEach((String serviceName) ->
                discoveryClient.getInstances(serviceName).forEach((ServiceInstance serviceInstance) ->
                        serviceList.add(
                                String.format("%s:%s", serviceName, serviceInstance.getUri())
                        )
                )
        );

        return serviceList;

    }

    @Override
    public String getNameByRestTemplate(String id) {

        return restTemplateClientCommunicator.getName(id);

    }

    @Override
    public String getNameByRibbon(String id) {

        return ribbonClientCommunicator.getName(id);

    }

    @Override
    public String getNameByFeign(String id) {

        return id + " is " + feignClientCommunicator.getName(id);

    }
}
