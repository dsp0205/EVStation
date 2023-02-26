package com.example.evcharge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.devtools.remote.server.HttpStatusHandler;

import com.example.evcharge.payload.Station;
import com.example.evcharge.serviceImpl.EvStationServiceImpl;

import java.util.List;

@RestController
public class EvStationController {

    private final EvStationServiceImpl evStationService;

    @Autowired
    public EvStationController(EvStationServiceImpl evStationService) {
        this.evStationService = evStationService;
    }

    @PostMapping("/evStation")
    public ResponseEntity<Void> registerStation(@RequestParam(name = "") Station station){
        evStationService.addStation(station);
        return ResponseEntity.status(HttpStatusHandler.CREATED).build();
    }

    @GetMapping("/city")
    public ResponseEntity<List<Station>> getStationsByCity(@RequestParam(name = "city") @NotBlank String cityName) {
        List<Station> stations = evStationService.getStation(cityName);
        return ResponseEntity.ok(stations);
    }
    
}
