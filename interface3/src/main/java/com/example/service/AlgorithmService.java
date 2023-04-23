package main.java.com.example.service;

import com.example.dto.AlgorithmRequest;

public interface AlgorithmService {
    double[] executeAlgorithm(AlgorithmRequest request);
}
