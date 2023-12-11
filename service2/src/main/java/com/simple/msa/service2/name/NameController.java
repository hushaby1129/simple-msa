package com.simple.msa.service2.name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class NameController {


    @Autowired
    NameService nameService;


    @GetMapping(value = "/{id}")
    public String getName(
            @PathVariable String id
    ) {

        return nameService.getName(id);

    }

}
