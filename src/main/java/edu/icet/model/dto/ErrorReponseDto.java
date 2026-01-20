package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ErrorReponseDto {
    private String errorCode;
    private String message;
    private String details;
    private LocalDateTime timestamp;
    private Integer remainingSeconds;
}
