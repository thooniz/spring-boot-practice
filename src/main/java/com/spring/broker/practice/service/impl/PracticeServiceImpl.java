package com.spring.broker.practice.service.impl;

import com.spring.broker.practice.service.PracticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class PracticeServiceImpl implements PracticeService {

    /**
     * @return Map
     */
    @Override
    public Map<String, Object> getPracticeData(Map<?, ?> requestBody) {

        log.info("================== 3. test Service Start : {} ==================", "OK");

        Map<String, Object> resultMap = new HashMap<>();

        resultMap.put("id", "test_id");
        resultMap.put("name", "test_name");
        resultMap.put("returnMsg", "success");

        log.info("================== 4. test Service End : {} ==================", resultMap);

        return resultMap;
    }
}
