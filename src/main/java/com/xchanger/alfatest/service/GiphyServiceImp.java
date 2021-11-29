package com.xchanger.alfatest.service;

import com.xchanger.alfatest.client.GiphyClient;
import com.xchanger.alfatest.service.serviceinterface.GiphyServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class GiphyServiceImp implements GiphyServiceInterface {
    private GiphyClient giphyClient;

    @Value("${giphy.token}")
    private String giphyToken;

    @Override
    public ResponseEntity<Map> getGif(String tagGif) {
        ResponseEntity<Map> randomGif = giphyClient.getRandomGif(this.giphyToken, tagGif);
        return ResponseEntity.ok(randomGif.getBody());
    }
}
