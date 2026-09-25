package com.algaworks.algasensors.device.management.api.model;

import com.algaworks.algasensors.device.management.api.config.jackson.StringToTSIDDeserializer;
import io.hypersistence.tsid.TSID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SensorMonitoringOutput {
    @JsonDeserialize(using = StringToTSIDDeserializer.class)
    private TSID id;
    private Double lastTemperature;
    private OffsetDateTime updatedAt;
    private Boolean enabled;
}
