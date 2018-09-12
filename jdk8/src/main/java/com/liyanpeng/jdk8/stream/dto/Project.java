package com.liyanpeng.jdk8.stream.dto;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目
 */
@Data
@Builder
public class Project {
    /**
     * 项目名称
     */
    private String name;
    /**
     * 编程语言
     */
    private String language;
    /**
     * star 数
     */
    private Integer stars;
    /**
     * 描述
     */
    private String description;
    /**
     * 作者
     */
    private String author;
    /**
     * fork数
     */
    private Integer forks;

    public static List<Project> buildData() {
        List<Project> data = new ArrayList<Project>();
        data.add(Project.builder().name("Blade").language("java").author("biezhi")
                .stars(3500).forks(2000).description("Lightning fast and elegant mvc framework for Java8").build());
        data.add(Project.builder().name("Table").language("JavaScript").author("Lixiansheng").stars(100).forks(2222).description("HelloWorkJava").build());
        return data;
    }


}
