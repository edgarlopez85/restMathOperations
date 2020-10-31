package com.example.rest.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;

@Data
@Builder
public class Response {
    private String primeNumber;
    private String evenNumber;
    private BigInteger factorial;
}
