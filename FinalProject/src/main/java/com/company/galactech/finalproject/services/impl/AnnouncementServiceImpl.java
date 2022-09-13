package com.company.galactech.finalproject.services.impl;

import com.company.galactech.finalproject.dao.inter.AnnouncementDAO;
import com.company.galactech.finalproject.model.BaseAnnouncement;
import com.company.galactech.finalproject.services.inter.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    AnnouncementDAO announcementDAO;

    @Autowired
    public AnnouncementServiceImpl(AnnouncementDAO announcementDAO) {
        this.announcementDAO = announcementDAO;
    }

//    @Override
//    public BaseAnnouncement getById(Integer id) {
//        return announcementDAO.getById(id);
//    }

    @Override
    public void createAnnouncement(BaseAnnouncement a) {
        announcementDAO.createAnnouncement(a);
    }
}
