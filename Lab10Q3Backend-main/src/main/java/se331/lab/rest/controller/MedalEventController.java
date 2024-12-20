package se331.lab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data/countries_medals.json")
public class MedalEventController {
    @Autowired
    private ResourceLoader resourceLoader;

    @GetMapping
    public ResponseEntity<Resource> getMedalEvents() {
        Resource resource = resourceLoader.getResource("classpath:/public/countries_medals.json");
        return ResponseEntity.ok(resource);
    }
}