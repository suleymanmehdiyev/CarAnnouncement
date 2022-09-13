package com.company.galactech.finalproject.dao.impl;

import com.company.galactech.finalproject.dao.inter.AnnouncementDAO;
import com.company.galactech.finalproject.model.BaseAnnouncement;
import com.company.galactech.finalproject.model.CarBrand;
import com.company.galactech.finalproject.model.CarModel;
import com.company.galactech.finalproject.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class AnnouncementDAOImpl implements AnnouncementDAO {

    @PersistenceContext
    EntityManager em;

//    @Transactional
//    @Override
//    public BaseAnnouncement getById(Integer id) {
//        return em.createNativeQuery("SELECT b,u,cb,cm,aa from base_announcement b\n" +
//                "left join users u on b.user_id = u.id\n" +
//                "left join car_brand cb on cb.id = b.brand_id\n" +
//                "left join car_model cm on cb.id = cm.brand_id\n" +
//                "left join addition_announcement aa on b.add_announce_id = aa.id where b.id =?1")
//                .setParameter(1,id)
//                .executeUpdate();
//    }

    @Transactional
    @Override
    public void createAnnouncement(BaseAnnouncement a) {

        em.createNativeQuery("INSERT INTO base_announcement (price,currency,sales_type,ban_type,year_car,brand_id,model_id,user_id) " +
                        "VALUES (?,?,?,?,?,?,?,?)")
                .setParameter(1, a.getPrice())
                .setParameter(2, a.getCurrency().name())
                .setParameter(3, a.getSalesType().getValue())
                .setParameter(4, a.getBanType().getValue())
                .setParameter(5, a.getYearCar())
                .setParameter(6, new CarBrand(a.getBrand().getId()))
                .setParameter(7, new CarModel(a.getModel().getId()))
                .setParameter(8, new User(a.getUser().getUserName(),
                                a.getUser().getEmail(),
                                a.getUser().getPhoneNumber()))
//                .setParameter(10,a.getAdditionAnnouncement())
                .executeUpdate();

    }
}
