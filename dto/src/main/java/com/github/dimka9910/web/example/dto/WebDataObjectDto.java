package com.github.dimka9910.web.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "WebDataObjectDto", description = "Пример Объета")
public class WebDataObjectDto {

    @Schema(name = "id", description = "id desc", nullable = true)
    private Long id;
    @Schema(name = "data", description = "data desc", nullable = true)
    private String data;

    private String port;
    private String host;
    private String hostName;
    private String hostNameProperty;
    private String additionalData;

}
