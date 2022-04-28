package lectures;

import beans.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import mockdata.MockData;
import org.junit.Test;

public class Lecture12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(
                () -> Lists.newArrayList(),
                (list, element) -> list.add(element),
                (list1, list2) -> list1.addAll(list2));

//                Collectors.toList()

    emails.forEach(System.out::println);
  }
}
