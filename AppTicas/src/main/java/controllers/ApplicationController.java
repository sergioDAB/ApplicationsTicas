package controllers;

import models.Application;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class ApplicationController {


    private ApplicationService applicationService;


    @RequestMapping("/apps")
    public String getAllApplication(){
        //List<Application> apps = applicationService.getAllAplications();
        //Application app = apps.get(0);

        return "hola";//applicationService.getAllAplications();
    }
}
