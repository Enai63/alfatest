package com.xchanger.alfatest.controller;

import com.xchanger.alfatest.client.ChangerClient;
import com.xchanger.alfatest.model.ChangerModel;


import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Locale;

@RequestMapping("/gif")
@RestController
public class MainController {
    @Autowired
    ChangerClient client;

    @GetMapping("/{symbol}")
    public void getCurrency(@PathVariable String symbol) {
//        ChangerModel latestCurrency = client.getlatestCurrency(symbol);
//        System.out.println(latestCurrency.getRates().get(symbol));
//        LocalDate yesterday = LocalDate.now().minusDays(1);
//        ChangerModel historicalCurrency = client.getHistoricalCurrency(symbol, yesterday.toString());
//        System.out.println(historicalCurrency.getRates().get(symbol));

    }




}
