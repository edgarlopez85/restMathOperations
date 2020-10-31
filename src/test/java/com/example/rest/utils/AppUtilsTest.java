package com.example.rest.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AppUtilsTest {

    AppUtils appUtils;

    @BeforeEach
    void init(){
        appUtils = new AppUtils();
    }

    @Test
    void isPrime() {
        int num = 5;
        assertThat(appUtils.isPrime(num)).isEqualTo("yes");
    }

    @Test
    void isEven() {
        int num = 5;
        assertThat(appUtils.isEven(num)).isEqualTo("no");
    }

    @Test
    void getFactorial() {
        int num = 5;
        assertThat(appUtils.getFactorial(num)).isEqualTo(120);
    }
}