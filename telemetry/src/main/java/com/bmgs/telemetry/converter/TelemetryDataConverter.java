package com.bmgs.telemetry.converter;


import com.bmgs.telemetry.data.entity.TelemetryData;
import com.bmgs.telemetry.rest.dto.TelemetryDto;
import com.bmgs.telemetry.rest.resource.TelemetryResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TelemetryDataConverter {

    TelemetryData toEntity(TelemetryDto dto);

    TelemetryResource toResource(TelemetryData telemetryData);

}
