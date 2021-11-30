package com.xchanger.alfatest.client;

import com.xchanger.alfatest.model.ChangerModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "changerController", url = "${changer.baseUrl}")
public interface ChangerClient {

    @GetMapping("/latest.json?base=${changer.baseCurrency}")
    ChangerModel getlatestCurrency(
            @RequestParam("app_id") String appId);

    @GetMapping("/historical/{date}.json?&base=${changer.baseCurrency}&base=${changer.baseCurrency}")
    ChangerModel getHistoricalCurrency(@PathVariable String date,
                                       @RequestParam("app_id") String appId3);
}
