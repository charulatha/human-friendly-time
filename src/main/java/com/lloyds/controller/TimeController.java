package com.lloyds.controller;

import com.lloyds.handler.TimeHandler;
import com.lloyds.service.TimeService;
import com.lloyds.exception.InvalidTimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("time")
@Slf4j
public class TimeController {

    @Autowired
    private TimeHandler timeHandler;

    @GetMapping({"/human-friendly", "/human-friendly/{numericTime}"})
    @ResponseBody
    public ResponseEntity<String> convertToHumanFriendly(@PathVariable(required = false) Optional<String> numericTime) {
        try {
            return ResponseEntity.ok(timeHandler.handle(numericTime));
        } catch (InvalidTimeException e) {
            log.error("Error while processing human friendly time : " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
