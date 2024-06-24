package com.test.log.controller;

import com.test.log.model.ShuffleRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/log")
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);


    @PostMapping
    public void logRequest(@RequestBody ShuffleRequest request) {
        logger.info("Received request: {}", request);
    }
}
