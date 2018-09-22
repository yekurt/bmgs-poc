package com.bmgs.telemetry.data.entity;

import lombok.*;
//import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@Document
public class TelemetryData {

    private String id;
    private String telemetryType;
}
