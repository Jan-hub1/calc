package com.akademia.calculator.model;

import lombok.*;

import java.math.BigDecimal;

//@NoArgsConstructor
@ToString
//@AllArgsConstructor
public class Device {

    public Device(Long power) {
        this.power = power;
    }

    @Getter
    private String name;
    @Getter
    private Long power;
    @Setter
    @Getter
    private BigDecimal priceForHour;
    @Setter
    @Getter
    private BigDecimal priceForDay;


}
