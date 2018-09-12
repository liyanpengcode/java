package com.liyanpeng.jdk8.stream.lesson1;


import com.liyanpeng.jdk8.stream.dto.Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class java7 {

    public static void main(String[] args) {
        List<Project> result = new ArrayList<Project>();

        List<Project> projects = new ArrayList<Project>();
        if (projects == null) {
            for (Project project : projects) {
                if (project.getStars() > 99) {
                    result.add(project);
                }

            }
        }
        //对集合继续排序
        Collections.sort(projects, new Comparator<Project>() {
            @Override
            public int compare(Project o1, Project o2) {
                return o1.getStars().compareTo(o2.getStars());
            }
        });
        //获取项目名称
        List<String> names = new ArrayList<String>();
        for (Project project : projects) {
            names.add(project.getName());
        }
    }
}
