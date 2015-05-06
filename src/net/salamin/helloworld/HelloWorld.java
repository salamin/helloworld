package net.salamin.helloworld;

/**
 * Created by florian on 18.04.15.
 */
public class HelloWorld {
    public static void main(String[] args) {

        Converter converter = new Converter();
        System.out.printf("PerformanceS=%s (%s%%)%n", converter.getPerformance(), converter.getPerformancePercent());
        converter.get();
    }
}
