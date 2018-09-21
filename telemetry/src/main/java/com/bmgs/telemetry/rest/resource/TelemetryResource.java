package com.bmgs.telemetry.rest.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TelemetryResource {

    private String id;
    private String telemetryType;
}
