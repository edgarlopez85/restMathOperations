package com.example.rest.utils;

import com.google.common.math.BigIntegerMath;
import lombok.RequiredArgsConstructor;
import org.apache.commons.math3.primes.Primes;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class AppUtils {
    public String isPrime(int num) {
        return Primes.isPrime(num) ? "yes" : "no";
    }

    public String isEven(int num) {
        return (num % 2 == 0) ? "yes" : "no";
    }

    public BigInteger getFactorial(int num) {
        return BigIntegerMath.factorial(num);
    }
}
