package appTicas.controllers;


import appTicas.models.Application;
import appTicas.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;


    @RequestMapping("/apps")
    public List<Application> getAllApplication(){
        return applicationService.getAllAplications();
    }
}
