package lectures;

import beans.Person;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Lecture1 {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        // 1. Find people aged less or equal 18

        List<Person> youngPeople = new ArrayList<>();

        for (Person person : people) {
            if (person.getAge() <= 18) {
                youngPeople.add(person);
            }
        }

        System.out.println(youngPeople);
        // 2. Then change implementation to find first 10 people

        int limit = 10;
        int start = 1;
        List<Person> firt10 = new ArrayList<>();

        for (Person person : youngPeople) {
            if (start <= limit) {
                firt10.add(person);
                start += 1;
            }
        }

        System.out.println(firt10.size());
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        ImmutableList<Person> people = MockData.getPeople();

        people.
                stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
