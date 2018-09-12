package com.liyanpeng.jdk8.growing.jdk7;


import com.liyanpeng.jdk8.growing.jdk5.EnumDome;

public class SwitchString {


    public static void main(String[] args) {
        String str = "java";

        switch (str) {
            case "java":
                break;
            case "python":
                break;
            case "ruby":
                break;
            default:
                break;
        }

        EnumDome enumDome = EnumDome.GREEN;
        switch (enumDome) {
            case RED:
                break;
            case YELLOW:
            default:
                break;

        }
    }
}
