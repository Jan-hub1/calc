package com.akademia.calculator.service;


import com.akademia.calculator.model.Device;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculateService {

    private static final BigDecimal HOUR_PRICE = new BigDecimal(0.87);
    private static final BigDecimal DAY_PRICE = new BigDecimal(10.50);

    public Device calculatePrice(Device device){

        BigDecimal priceForDay = new BigDecimal(device.getPower()).multiply(DAY_PRICE);
        BigDecimal priceForHour = new BigDecimal(device.getPower()).multiply(HOUR_PRICE)
                .setScale(2,BigDecimal.ROUND_HALF_DOWN);

        device.setPriceForDay(priceForDay);
        device.setPriceForHour(priceForHour);

        return device;
    }


}
