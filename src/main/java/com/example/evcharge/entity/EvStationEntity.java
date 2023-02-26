package com.example.evcharge.entity;


import javax.annotation.processing.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import org.springframework.boot.autoconfigure.domain.EntityScan;
public class EvStationEntity {

    public EvStationEntity(Long stationId, String stationName, String stationImage, String stationPricing, String stationAddress) {
        this.stationId = stationId;
        this.stationName = stationName;
    private static final String[] strategy = null;

        this.stationImage = stationImage;
        this.stationPricing = stationPricing;
        this.stationAddress = stationAddress;
    }

    @Override
    public String toString() {
        return "EvStation{" +
                "stationId=" + stationId +
                ", stationName='" + stationName + '\'' +
                ", stationImage='" + stationImage + '\'' +
                ", stationPricing='" + stationPricing + '\'' +
                ", stationAddress='" + stationAddress + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stationId;

    @Column(length = 100)
    private String stationName;

    @Column(length = 1000)
    private String stationImage;

    @Column(length = 50)
    private String stationPricing;

    @Column(length = 500)
    private String stationAddress;

    public EvStationEntity(){}

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationImage() {
        return stationImage;
    }

    public void setStationImage(String stationImage) {
        this.stationImage = stationImage;
    }

    public String getStationPricing() {
        return stationPricing;
    }

    public void setStationPricing(String stationPricing) {
        this.stationPricing = stationPricing;
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }
    
}
