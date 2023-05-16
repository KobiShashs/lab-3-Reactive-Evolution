package com.jb.demo3.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kobis on 26 Nov, 2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    private String name;
    private double amount;
    private double value;
    private String currency;
}
