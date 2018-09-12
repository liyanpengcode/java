package com.liyanpeng.jdk8.growing.jdk8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Demo {

    public static void main(String[] args) {

        final String text = "Lets learn java 8";
        //加密
        final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);
        //解密
        final String decoded = new String(
                Base64.getDecoder().decode(encoded)
                , StandardCharsets.UTF_8);
        System.err.println(decoded);

    }
}
