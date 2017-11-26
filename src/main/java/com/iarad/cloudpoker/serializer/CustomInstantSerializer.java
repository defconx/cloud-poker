package com.iarad.cloudpoker.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.Instant;

/**
 * CustomLocalDateSerializer
 *
 * @author Stuart MacKenzie
 */
public class CustomInstantSerializer extends StdSerializer<Instant> {

    public CustomInstantSerializer() {
        this(null);
    }

    public CustomInstantSerializer(Class<Instant> t) {
        super(t);
    }

    @Override
    public void serialize(Instant value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(value.toString());
    }
}
