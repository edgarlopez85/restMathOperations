package com.example.rest.controller;

import com.example.rest.model.Response;
import com.example.rest.service.MathOperations;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/math")
@RequiredArgsConstructor
public class MathController {

    private final MathOperations mathOperations;

    @GetMapping(value = "/{number}", produces = "application/json")
    public ResponseEntity<Response> getOperations(@PathVariable int number) {
        return ResponseEntity.ok().body(mathOperations.buildResponse(number));
    }
}
