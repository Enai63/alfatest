package com.xchanger.alfatest.service;

import com.xchanger.alfatest.client.ChangerClient;
import com.xchanger.alfatest.model.ChangerModel;
import com.xchanger.alfatest.service.serviceinterface.ChangerServiceInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ChangerServiceImp implements ChangerServiceInterface {
    @Value("${changer.token}")
    private String changerToken;


    private ChangerModel latestChangerModel;
    private ChangerModel historicalChangerModel;

    private final ChangerClient client;

    public ChangerServiceImp(ChangerClient client) {
        this.client = client;
    }






    @Scheduled(cron = "@daily")
    @Async
    void initHistoricalChangerModel() {
        String yesterdayDate = LocalDate.now().minusDays(1).toString();
        this.historicalChangerModel = client.getHistoricalCurrency(yesterdayDate, this.changerToken);
    }

    @Scheduled(cron = "@hourly")
    @Async
    void initLatestChangerModel() {
        this.latestChangerModel = client.getlatestCurrency(this.changerToken);
    }

}
