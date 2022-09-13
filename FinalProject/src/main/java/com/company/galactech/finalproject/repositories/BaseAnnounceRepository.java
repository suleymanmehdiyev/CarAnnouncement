package com.company.galactech.finalproject.repositories;

import com.company.galactech.finalproject.model.BaseAnnouncement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseAnnounceRepository extends JpaRepository<BaseAnnouncement,Integer> {
    @Query("select b from BaseAnnouncement b where b.id =?1")
    BaseAnnouncement findByAnnounceId(Integer id);

}
