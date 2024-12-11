package com.ramaih.workshop.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkshopConroller {

@GetMapping("/workshop")
public @ResponseBody String getWorkshop() {
return "Welcome to the workshop lab";
}



}
