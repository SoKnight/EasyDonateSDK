package ru.soknight.easydonate.sdk.json.deserialize;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import ru.soknight.easydonate.sdk.EasyDonateSDK;

public class DateSerializer extends JsonSerializer<LocalDateTime> {

    @Override
    public void serialize(LocalDateTime value, JsonGenerator generator, SerializerProvider serializers)
            throws IOException
    {
        generator.writeString(value != null ? value.format(EasyDonateSDK.DATE_FORMATTER) : null);
    }

}