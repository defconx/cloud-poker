package com.iarad.cloudpoker.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;

/**
 * CustomLocalDateSerializer
 *
 * @author Stuart MacKenzie
 */
public class CustomLocalDateSerializer extends StdSerializer<LocalDate> {

    public CustomLocalDateSerializer() {
        this(null);
    }

    public CustomLocalDateSerializer(Class<LocalDate> localDateClass) {
        super(localDateClass);
    }

    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(value.toString());
    }
}
