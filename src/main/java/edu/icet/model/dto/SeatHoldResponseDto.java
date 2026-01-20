package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SeatHoldResponseDto {
    private Long id;
    private String seatNumber;
    private String status;
    private Long heldByUserId;
    private LocalDateTime holdExpiry;
    private long remainingSeconds;
}
