package org.kafkahq.service.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchemaVersionDTO {
    private String subject;
    private String compatibilityLevel;
    private String schema;
}
