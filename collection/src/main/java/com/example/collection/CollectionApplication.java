package com.example.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class CollectionApplication {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1); // 0
        list.add(5); // 1
        list.add(12); // 2

        System.out.println(list.get(1));

        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set.size());

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("jaeha", 1);
        map.put("adam", 2);
        map.put("adam1", 3);
        map.put("jaeha1", 4);
        map.put("jaeha2", 5);

        System.out.println(map.get("adam")); // 2
        System.out.println(map.get("null")); // null

        List<Student> students = new ArrayList<>();
        students.add(new Student());
    }

}
