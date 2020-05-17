package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BillionaireDAO {
    @Autowired
    private BillionairesRepository billionairesRepository;

    @Transactional(readOnly = true)
    public List<String > getUserdetails(String name){
        Optional<Billionaires> billionairesList = billionairesRepository.findById(name);
                //findByFirstName(name);
        List<String>user = new ArrayList<>();
        /*for (Billionaires details:
            billionairesList ) {*/
            user.add(billionairesList.get().getFirstName());
            user.add(billionairesList.get().getLastName());
            user.add(billionairesList.get().getCareer());
        //}
        return user;
    }
}
