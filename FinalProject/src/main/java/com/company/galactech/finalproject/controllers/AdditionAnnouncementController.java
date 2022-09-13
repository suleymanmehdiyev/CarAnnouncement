package com.company.galactech.finalproject.controllers;


import com.company.galactech.finalproject.dto.AdditionAnnouncementDTO;
import com.company.galactech.finalproject.model.BaseAnnouncement;
import com.company.galactech.finalproject.services.inter.BaseAnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class AdditionAnnouncementController {
   BaseAnnounceService baseAnnounceService;

   @Autowired
    public AdditionAnnouncementController(BaseAnnounceService baseAnnounceService) {
        this.baseAnnounceService = baseAnnounceService;
    }

    @GetMapping("/announce/{id}")
    public ResponseEntity<AdditionAnnouncementDTO> findByAnnounceId(@PathVariable Integer id) {
        BaseAnnouncement announce = baseAnnounceService.findByAnnounceId(id);
        AdditionAnnouncementDTO announceDTO = new AdditionAnnouncementDTO(announce);
        return ResponseEntity.ok(announceDTO);
    }
}
