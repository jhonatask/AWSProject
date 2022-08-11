package br.com.jhonata.awsproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/health")
public class HealthController {
    private static final Logger LOG = LoggerFactory.getLogger(HealthController.class);

    @GetMapping("/alive")
    public ResponseEntity<?> alive(){
        LOG.info("application UP");
        return ResponseEntity.ok("UP");
    }

}
