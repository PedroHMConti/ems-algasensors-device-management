package com.algaworks.algasensors.device.management.api.client.impl;


import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
@NoArgsConstructor
public class SensorMonitoringException extends RuntimeException {
    public SensorMonitoringException(String message) {
        super(message);
    }
}
