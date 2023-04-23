package test.java.com.example;

import com.example.dto.AlgorithmRequest;
import com.example.service.AlgorithmService;
import com.example.service.impl.AlgorithmServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AlgorithmServiceTest {
    @Test
    public void testExecuteAlgorithm() {
        AlgorithmService algorithmService = new AlgorithmServiceImpl();

        AlgorithmRequest request = new AlgorithmRequest();
        request.setAlgorithmType("DE");
        request.setPopulationSize(100);
        request.setDimensions(30);
        request.setIterations(1000);

        double[] expectedResult = {/* 期望的结果 */};
        double[] actualResult = algorithmService.executeAlgorithm(request);
        assertArrayEquals(expectedResult, actualResult, 1e-9);
    }
}
