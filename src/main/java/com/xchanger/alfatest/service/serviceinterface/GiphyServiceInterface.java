package com.xchanger.alfatest.service.serviceinterface;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface GiphyServiceInterface {
    ResponseEntity<Map> getGif(String tagGif);
}
