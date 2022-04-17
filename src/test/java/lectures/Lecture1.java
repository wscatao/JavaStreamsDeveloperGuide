package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    // 1. Find people aged less or equal 18

    List<Person> only18orLessList = people.stream().filter(person -> person.getAge() <= 18).collect(Collectors.toList());

    System.out.println(only18orLessList);


    // 2. Then change implementation to find first 10 people

    int i = 10;
    List<Person> firt10 = new ArrayList<>();

    while (i > 0) {
      firt10.add(only18orLessList.get(i));
      i--;
    }

    System.out.println(firt10);

  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();

  }
}
