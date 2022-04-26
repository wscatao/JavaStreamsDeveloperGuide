package lectures;


import beans.Car;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lecture8 {

  @Test
  public void simpleGrouping() throws Exception {

    ImmutableList<Car> cars = MockData.getCars();

    Map<String, List<Car>> carsGroupedByMake = cars.stream().collect(Collectors.groupingBy(Car::getMake));

    carsGroupedByMake.forEach((make, makeCars) -> {
      System.out.println(make);
      makeCars.forEach(System.out::println);
    });

  }

  @Test
  public void groupingAndCounting() throws Exception {
    ArrayList<String> names = Lists
        .newArrayList(
            "John",
            "John",
            "Mariam",
            "Alex",
            "Mohammado",
            "Mohammado",
            "Vincent",
            "Alex",
            "Alex"
        );

    Map<String, Long> countEachNameAppear = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    countEachNameAppear.forEach((name, times) -> System.out.println(name + " > " + times));
  }

}