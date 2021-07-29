package com.jplbrasil.helloworldapi.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {
    private String message;
}
