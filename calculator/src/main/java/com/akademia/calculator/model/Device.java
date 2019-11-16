package com.akademia.calculator.model;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
public class Device {

    private String nazwa;
    private Long power;
    private BigDecimal priceForHour;
    private BigDecimal priceForDay;

}
