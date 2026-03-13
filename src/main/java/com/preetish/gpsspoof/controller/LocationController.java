package com.preetish.gpsspoof.controller;

import com.preetish.gpsspoof.model.Location;
import com.preetish.gpsspoof.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping
    public String receiveLocation(@RequestBody Location location){

        return locationService.processLocation(location);
    }

    @GetMapping("/test")
    public String test(){
        return " Backend working";
    }
}
