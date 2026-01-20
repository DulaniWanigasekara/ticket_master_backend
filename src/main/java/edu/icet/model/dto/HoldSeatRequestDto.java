package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HoldSeatRequestDto {
    private Long userId;
    private Long seatId;
}
