package com.example.app3.controller;

import com.example.app3.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(final ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("")
    public String getClient(Model model) { //MVC
//        model.addAttribute("myClient", clientService.getClient());
        model.addAttribute("allClients", clientService.getAllClients());  //[1,alex,   2,claudia ....]
        return "clientView";
    }



}
