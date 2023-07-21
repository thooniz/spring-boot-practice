package com.spring.broker.practice.controller;

import com.spring.broker.practice.service.PracticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
//@RequiredArgsConstructor
@RequestMapping("/practice")
public class PracticeController {

    private PracticeService practiceService;

    @PostMapping("/")
    public Map<String, Object> postMappingTest(@RequestBody Map<?, ?> requestBody) {

        log.info("================== 2. test Controller Start : {} ==================", "OK");

        Map<String, Object> responseBody = practiceService.getPracticeData(requestBody);

        log.info("================== 3. test Controller End : {} ==================", responseBody);

        return responseBody;

    }

}