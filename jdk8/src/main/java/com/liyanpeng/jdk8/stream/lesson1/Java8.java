package com.liyanpeng.jdk8.stream.lesson1;

import com.liyanpeng.jdk8.stream.dto.Project;

import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();
        List<String> names = projects.stream().filter(p -> {
            System.out.println(p.getName());
            return p.getStars() > 90;
        }).map(p -> {
            System.out.println(p.getName());
            return p.getName();
        }).limit(2)
                .collect(Collectors.toList());
        System.out.println(names);
        names.stream().forEach(name -> System.out.println(name));
    }
}
