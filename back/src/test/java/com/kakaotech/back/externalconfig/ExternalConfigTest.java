package com.kakaotech.back.externalconfig;

import com.kakaotech.back.BackApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(
        classes = BackApplication.class
)
public class ExternalConfigTest {
    @Value("${spring.application.name}")
    String appName;

    @Test
    @DisplayName("설정 정보 가져오기")
    void testGetAppProps(){
        assertEquals(appName, "local");
    }
}
