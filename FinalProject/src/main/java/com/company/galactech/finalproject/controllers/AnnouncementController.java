package com.company.galactech.finalproject.controllers;

import com.company.galactech.finalproject.model.BaseAnnouncement;
import com.company.galactech.finalproject.services.inter.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autos")
public class AnnouncementController {
    AnnouncementService announcementService;

    @Autowired
    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

//    @GetMapping("/getById")
//    public ResponseEntity<BaseAnnouncement> getById(@RequestParam Integer id){
//        return ResponseEntity.ok(announcementService.getById(id));
//    }
    @PostMapping("/new")
    public void createAnnouncement(@RequestBody BaseAnnouncement a) {
        announcementService.createAnnouncement(a);
    }
}
