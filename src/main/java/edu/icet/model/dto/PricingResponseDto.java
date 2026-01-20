package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PricingResponseDto {
    private Double basePrice;
    private String userTier;
    private Double finalPrice;
    private Integer discountPercentage;
    private Boolean priorityAccess;
    private String note;
}
