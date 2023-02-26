package com.example.evcharge.controller;

import java.util.List;

import com.example.evcharge.payload.Station;

public interface ResponseEntity<T> {

    static ResponseEntity<List<Station>> ok(List<Station> stations) {
        return null;
    }

}
