package lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author : Moafi
 * @DATE :23/02/2020
 **/
public class TestLambda {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hanieh");
        list.add("sobhan");
        list.add("majid");
        String[] names ={"hani","sobi","maji"};

        //Comparator<String > com=(x,y)->x.compareToIgnoreCase(y);
        Comparator<String> com=String::compareToIgnoreCase;


        // method reference Class :: instanceMethod
        Arrays.sort(names,(a,b)->a.compareToIgnoreCase(b));
        Arrays.sort(names,com);
        Arrays.sort(names,String::compareToIgnoreCase);

        Collections.sort(list,String::compareToIgnoreCase);

        //remove all null element
        //method reference Class::staticMethod
        list.removeIf(Objects::isNull);
        //print all name
        //method reference Object ::  instanceMethod
        list.forEach(System.out::println);

        //Constructor reference Class :: new
//        Stream<Integer> stream=list.stream().map(s->new Integer(s));
        Stream<Employee> stream=list.stream().map(Employee::new);
        System.out.println(stream);
        List<Employee> e=stream.collect(Collectors.toList());
    }
}
