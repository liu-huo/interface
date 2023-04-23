package main.java.com.example.service.impl;

import com.example.algorithms.Algorithm;
import com.example.algorithms.DifferentialEvolution;
import com.example.algorithms.ParticleSwarmOptimization;
import com.example.dto.AlgorithmRequest;
import com.example.service.AlgorithmService;
import org.springframework.stereotype.Service;

@Service
public class AlgorithmServiceImpl implements AlgorithmService {

    @Override
    public double[] executeAlgorithm(AlgorithmRequest request) {
        Algorithm algorithm;
        if ("DE".equalsIgnoreCase(request.getAlgorithmType())) {
            algorithm = new DifferentialEvolution();
        } else if ("PSO".equalsIgnoreCase(request.getAlgorithmType())) {
            algorithm = new ParticleSwarmOptimization();
        } else {
            throw new IllegalArgumentException("Invalid algorithm type");
        }

        return algorithm.execute(request.getPopulationSize(), request.getDimensions(), request.getIterations());
    }
}

