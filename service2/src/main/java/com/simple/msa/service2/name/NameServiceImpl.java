package com.simple.msa.service2.name;

import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements NameService {

    @Override
    public String getName(String id) {

        switch (id) {
            case "1":
                return "Kim";
            case "2":
                return "Lee";
            case "3":
                return "Park";
            default:
                return "Unknown";
        }

    }

}
