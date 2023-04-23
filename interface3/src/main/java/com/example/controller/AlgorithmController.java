package main.java.com.example.controller;

import com.example.dto.AlgorithmRequest;
import com.example.dto.AlgorithmResponse;
import com.example.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgorithmController {

    @Autowired
    private AlgorithmService algorithmService;

    @PostMapping("/algorithm")
    public AlgorithmResponse executeAlgorithm(@RequestBody AlgorithmRequest request) {
        double[] result = algorithmService.executeAlgorithm(request);
        return new AlgorithmResponse(result);
    }
}
