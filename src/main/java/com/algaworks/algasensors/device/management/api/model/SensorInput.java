package com.algaworks.algasensors.device.management.api.model;


import lombok.Data;

@Data
public class SensorInput {

    private String name;
    private String ip;
    private String Location;
    private String protocol;
    private String model;
}
