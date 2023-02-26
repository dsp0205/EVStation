package com.example.evcharge.payload;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Setter
@Getter
public class Station {

    private Long stationId;
    private String stationName;
    private String stationImage;
    private String stationPricing;
    private String stationAddress;
    
}
