package Java9;

import java.util.Map;


public class CollectionFactoryMethod {

    public static void main(String[] args) {

        /*List<String> list = List.of("java","python","MangoDB","ReactJS");
        list.add("Microservices");
        list.stream().forEach(System.out::println);*/

        /*Set<String> set = Set.of("java","python","MangoDB","ReactJS");
        set.add("Microservices");
        set.stream().forEach(System.out::println);*/

        Map<String, String> map = Map.of("name", "Sarita", "city", "Pune");
        //map.put("Mumbai","riya");
        map.forEach((k,v) -> System.out.println(k + v));

    }
}
