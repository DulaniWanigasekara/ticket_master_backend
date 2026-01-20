package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookingResponseDto {
        private Long bookingId;
        private Long userId;
        private Long seatId;
        private String seatNumber;
        private double amountPaid;
        private String status;
        private boolean priorityAccess;


}
