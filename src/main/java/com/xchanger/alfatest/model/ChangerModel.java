package com.xchanger.alfatest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChangerModel {
    private String disclaimer;
    private String license;
    private Date timestamp;
    private String base;
    private Map<String, Double> rates;
}

