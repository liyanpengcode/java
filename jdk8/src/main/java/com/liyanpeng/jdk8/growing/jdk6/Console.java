package com.liyanpeng.jdk8.growing.jdk6;

public class Console {

    public static void main(String[] args) {
        java.io.Console console = System.console();

        if (console != null) {
            String username = new String(console.readLine("Enter User:", new Object[0]));
            String password = new String(console.readPassword("Enter Passwod:", new Object[0]));
            console.printf("user name is :%s", new Object[]{username});
            console.printf("Password is :%/s", new Object[]{password});
        } else {
            System.out.println(
                    console

            );
        }
    }
}



