package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.function.Predicate;
import org.junit.Test;

public class Lecture6 {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

  /**
   * Os dois métodos findFirst() e findAny() fazem praticamente a mesma coisa,
   * a diferença principal é que finaAny() pode retornar um valor aleatório, sendo assim é mais
   * performático principalmente se estiver usando paralelismo.
   */

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    Integer integer = Arrays.stream(numbers).filter(numbersLessThan10).findAny().get();

    System.out.println(integer);

  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    Integer integer = Arrays.stream(numbers).filter(numbersLessThan10).findFirst().get();

    System.out.println(integer);

  }
}

