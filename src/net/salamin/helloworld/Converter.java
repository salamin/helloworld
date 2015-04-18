package net.salamin.helloworld;

import java.util.Arrays;
import java.util.List;

/**
 * Created by florian on 18.04.15.
 */
public class Converter {
    private static List<Double> values = Arrays.asList(1.02d, 1.04, 1.03, 0.99, 1.00, 1.03, 1.05);

    DoubleMath performance = (a, b) -> b / a - 1;

    DoubleMath performancePercent = (a, b) -> (b / a - 1) * 100;

    public Converter() {
    }

    Double operateBinary(Double a, Double b, DoubleMath op) {
        return op.operation(a, b);
    }

    public Double getPerformance() {
        return operateBinary(values.get(0), values.get(1), performance);
    }

    public Double getPerformancePercent() {
        return operateBinary(values.get(0), values.get(1), performancePercent);
    }

}
