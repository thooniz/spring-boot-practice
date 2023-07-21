package com.spring.broker.practice.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface PracticeService {

    /**
     *
     * @return ResponseEntity
     */
    Map<String, Object> getPracticeData(Map<?, ?> requestBody);
}