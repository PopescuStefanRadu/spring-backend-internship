package com.example.app3.resource;

import com.example.app3.service.UserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// @RestController e echivalentul dpdv functional a anotarilor cu care vine, cele de dedesubt
//@ResponseBody
//@Component
@RequiredArgsConstructor
@RequestMapping(path = "/api/user")
public class UserResource {

    // REST
    @NonNull
    private final UserService userService;


    @GetMapping("/userHashes")
    public List<String> getUserHashes() {
        return userService.getUserHashes();
    }

    @GetMapping("/test")
    public String test() {
        userService.getUserHashesFromExternalApp();
        return "";
    }

    // request (din browser) -> Tomacat -> Controller -> Service -> (..Service) -> Repository -> DB
    // Browser <- Tomcat <- Pagina <- TemplatingEng    <- (view + model) Controller  <-  Service                         <-              <-


    // Browser <- Tomcat  <- Transformare(Obj -> Json)  <- Object

}
