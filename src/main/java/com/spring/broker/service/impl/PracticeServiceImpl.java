package com.spring.broker.service.impl;

import com.spring.broker.service.PracticeService;
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
    public Map<String, Object> getTest() {

        log.info("================== 3. test Service Start : {} ==================", "OK");

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("returnMsg", "success");

        log.info("================== 4. test Service End : {} ==================", returnMap);

        return returnMap;
    }
}
