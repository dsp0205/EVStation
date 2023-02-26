package com.example.evcharge.service;

import com.example.evcharge.payload.Station;

import java.util.List;

public interface EvStationService {
    

    public boolean addStation(Station station);
    public List<Station> getStation(String cityName);

}
