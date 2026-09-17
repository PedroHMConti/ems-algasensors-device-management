package com.algaworks.algasensors.device.management.api.config.jackson;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ValueSerializer;
import io.hypersistence.tsid.TSID;

public class TSIDToStringSerializer extends ValueSerializer<TSID> {

    @Override
    public void serialize(TSID value, JsonGenerator gen, SerializationContext ctxt) throws JacksonException {
        gen.writeString(value.toString());
    }
}