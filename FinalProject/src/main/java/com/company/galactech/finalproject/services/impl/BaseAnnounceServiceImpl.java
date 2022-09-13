package com.company.galactech.finalproject.services.impl;

import com.company.galactech.finalproject.model.BaseAnnouncement;
import com.company.galactech.finalproject.repositories.BaseAnnounceRepository;
import com.company.galactech.finalproject.services.inter.BaseAnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseAnnounceServiceImpl implements BaseAnnounceService {
    BaseAnnounceRepository baseAnnounceRepository;

    @Autowired
    public BaseAnnounceServiceImpl(BaseAnnounceRepository baseAnnounceRepository) {
        this.baseAnnounceRepository = baseAnnounceRepository;
    }

    @Override
    public BaseAnnouncement findByAnnounceId(Integer id) {
        return baseAnnounceRepository.findByAnnounceId(id);
    }
}
