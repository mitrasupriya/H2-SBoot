package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillionaireController {
    @Autowired
    BillionaireDAO bellionareDAO;

    @GetMapping(path="/{firstName}")
    public List<String> getBillionareName(@PathVariable("firstName") String name){
    return bellionareDAO.getUserdetails(name);

    }
}
