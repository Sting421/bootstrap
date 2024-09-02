package com.g3vitorillo.appdev.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAppDev {
   
    @RequestMapping("/print")
    public String print(){
		return "Aldrin John, Vitorillo";
	}


}
