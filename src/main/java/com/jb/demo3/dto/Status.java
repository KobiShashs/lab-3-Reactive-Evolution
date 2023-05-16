package com.jb.demo3.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kobis on 26 Nov, 2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Status {

    private int id;
    private String name;
    private double balance;

}
