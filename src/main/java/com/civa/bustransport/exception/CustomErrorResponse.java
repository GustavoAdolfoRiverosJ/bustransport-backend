package com.civa.bustransport.exception;

import java.time.LocalDateTime;

public record CustomErrorResponse(
    LocalDateTime dateTime,
    String message,
    String path
) {
}
