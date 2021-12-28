package com.util;

import com.db.Person;
import org.springframework.security.core.parameters.P;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @author sunke
 * @DATE 2021/12/11
 **/
public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> first =
                list.stream()
                        .map(x -> x * x)
                        .filter(x -> x % 3 == 0)
                        .findFirst();
        Integer add = list.stream().reduce(0, Math::addExact);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(add);
        System.out.println(sum);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("WangLei",19,1));
        persons.add(new Person("jack",20,1));
        persons.add(new Person("tom",18,1));
        persons.add(new Person("tom",18,1));
        persons.add(new Person("helen",17,0));
        persons.add(new Person("Lily",19,0));
        Integer size = persons.stream().collect(collectingAndThen(toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getAge))), Collection::size));
        System.out.println(size);
        List<Person> p = persons.stream().collect(collectingAndThen(toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getAge))), ArrayList::new));
        System.out.println(p);

        Map<Integer, Set<String>> set = persons.stream().collect(
                groupingBy(Person::getSex, mapping(
                        x -> {
                            if (x.getAge() <= 18) {
                                return x.getName();
                            } else {
                                return x.getName();
                            }
                        },
                        toCollection(HashSet::new))));
        System.out.println(set);
    }
}
