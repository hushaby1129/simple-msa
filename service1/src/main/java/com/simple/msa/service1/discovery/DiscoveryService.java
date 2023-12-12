package com.simple.msa.service1.discovery;

import java.util.List;

public interface DiscoveryService {

    List<String> getServiceList();

    String getNameByRestTemplate(String id);

    String getNameByRibbon(String id);

    String getNameByFeign(String id);

}
