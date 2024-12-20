package se331.lab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data/db.json")
public class EventController {
    @Autowired
    private ResourceLoader resourceLoader;

    @GetMapping
    public ResponseEntity<Resource> getEvents() {
        Resource resource = resourceLoader.getResource("classpath:/public/db.json");
        return ResponseEntity.ok(resource);
    }
}