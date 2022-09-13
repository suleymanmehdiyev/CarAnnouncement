package com.company.galactech.finalproject.services.impl;

import com.company.galactech.finalproject.model.AdditionAnnouncement;
import com.company.galactech.finalproject.repositories.AddAnnounceRepository;
import com.company.galactech.finalproject.services.inter.AddAnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddAnnounceServiceImpl implements AddAnnounceService {
    AddAnnounceRepository addAnnounceRepository;

    @Autowired
    public AddAnnounceServiceImpl(AddAnnounceRepository addAnnounceRepository) {
        this.addAnnounceRepository = addAnnounceRepository;
    }

    @Override
    public AdditionAnnouncement findByAnnounceId(Integer id) {
        return addAnnounceRepository.findByAnnounceId(id);
    }
}
