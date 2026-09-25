package com.algaworks.algasensors.device.management.api.client;


import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
@NoArgsConstructor
public class SensorMonitoringClientBadGatewayException extends RuntimeException {
    public SensorMonitoringClientBadGatewayException(String message) {
        super(message);
    }
}
