package com.fundamentosplatzi.springboot.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping//aceptar todas solicitudes a nivel http
    @ResponseBody//responder un cuerpo a travez de un servicio
    public ResponseEntity<String> function(){
        return new ResponseEntity<>( "Hello form controller un cambio mas", HttpStatus.OK);
    }

}
