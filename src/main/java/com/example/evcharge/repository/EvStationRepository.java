package com.example.evcharge.repository;

import com.example.evcharge.entity.EvStationEntity;
import com.example.evcharge.payload.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvStationRepository extends JpaRepository<EvStationEntity,Long> {

    public Boolean existsByStationName(String stationName);
    public Station findByStationAddress(String city);
    public void save(EvStationEntity evStation);


    
}
