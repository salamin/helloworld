package net.salamin.helloworld;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by florian on 18.04.15.
 */
public class Converter {
    private static List<Double> values = Arrays.asList(1.02, 1.04, 1.03, 0.99, 1.00, 1.03, 1.05);

    static DoubleMath performance = (a, b) -> b / a - 1;

    DoubleMath performancePercent = (a, b) -> (b / a - 1) * 100;

    public Converter() {
    }

    static Double operateBinary(Double a, Double b, DoubleMath op) {

        return op.operation(a, b);
    }

    public Double getPerformance() {

        return operateBinary(values.get(0), values.get(1), performance);
    }

    public Double getPerformancePercent() {

        return operateBinary(values.get(0), values.get(1), performancePercent);
    }

    public void get() {

        IntStream.range(0, values.size()-1)
                .mapToObj(i -> values.get(i+1) / values.get(i) - 1)
                .forEach(System.out::println);
    }
}
