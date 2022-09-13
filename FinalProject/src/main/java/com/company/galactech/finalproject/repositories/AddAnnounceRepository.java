package com.company.galactech.finalproject.repositories;

import com.company.galactech.finalproject.model.AdditionAnnouncement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddAnnounceRepository extends JpaRepository<AdditionAnnouncement,Integer>{
    @Query("select b from AdditionAnnouncement b where b.id =?1")
    AdditionAnnouncement findByAnnounceId(Integer id);
}
