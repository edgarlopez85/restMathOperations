package com.example.rest.service;

import com.example.rest.model.Response;
import com.example.rest.utils.AppUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MathOperations {

    private final AppUtils appUtils;

    public Response buildResponse(int num){
        return Response.builder()
                .primeNumber(appUtils.isPrime(num))
                .evenNumber(appUtils.isEven(num))
                .factorial(appUtils.getFactorial(num))
                .build();
    }

}
