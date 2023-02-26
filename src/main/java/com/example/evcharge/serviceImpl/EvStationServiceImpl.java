package com.example.evcharge.serviceImpl;

import com.example.evcharge.service.EvStationService;
import com.example.evcharge.payload.Station;
import com.example.evcharge.repository.EvStationRepository;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.evcharge.entity.EvStationEntity;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EvStationServiceImpl implements EvStationService {

    @Autowired
    EvStationRepository evStationRepository;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(EvStationServiceImpl.class);

    public boolean addStation(Station station) {
        if (station == null) {
            logger.error("StationDetails is null");
            return false;
        }
        
        if (evStationRepository.existsByStationName(station.getStationName())) {
            logger.info("Station already exists in database: {}", station.getStationName());
            return false;
        }
        
        EvStationEntity evStation = new EvStationEntity();
        evStation.setStationId(station.getStationId());
        evStation.setStationName(station.getStationName());
        evStation.setStationImage(station.getStationImage());
        evStation.setStationPricing(station.getStationPricing());
        evStation.setStationAddress(station.getStationAddress());
        
        try {
            evStationRepository.save(evStation);
            logger.info("Station added successfully: {}", station.getStationName());
            return true;
        } catch (DateTimeException e) {
            logger.error("Failed to add station: {}", station.getStationName(), e);
            return false;
        }
    }

    public List<Station> getStation(String cityName) {
        List<Station> details = new ArrayList<>();
        Station station = evStationRepository.findByStationAddress(cityName);
        if (station != null) {
            details.add(station);
        }
        return details;
    }
    
}
