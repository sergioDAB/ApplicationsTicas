package appTicas.controllers;


import appTicas.models.ApplicationEntity;
import appTicas.services.ApplicationService;
import appTicas.utils.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    protected ApplicationService applicationService;

    protected ObjectMapper objectMapper;

    @RequestMapping(value = "/saveUpdate", method= RequestMethod.POST)
    public Response saveUpdate(@RequestBody String json) throws IOException {
        this.objectMapper = new ObjectMapper();
        ApplicationEntity app = this.objectMapper.readValue(json,ApplicationEntity.class);

        if(!this.isValid(app)){
            return new Response(HttpStatus.NOT_ACCEPTABLE.value(),"falta el indicador");
        }
        this.applicationService.save(app);
        return new Response(HttpStatus.OK.value(),"success");
    }

    public boolean isValid(ApplicationEntity app){
        if (app.getIdApp()!= null){
            return true;
        }
        return  false;
    }

}
