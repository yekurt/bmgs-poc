package com.bmgs.telemetry.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TelemetryDto {

    private String id;
    private String telemetryType;
}
