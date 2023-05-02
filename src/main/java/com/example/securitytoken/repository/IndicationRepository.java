package com.example.securitytoken.repository;

import com.example.securitytoken.model.Indication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IndicationRepository extends JpaRepository<Indication, Long> {
    @Query(value = "select avg(i.value) from Indication i WHERE i.serialSecret.serial=?1")
    Double getAvgIndication(String serial);


}
