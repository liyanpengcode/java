package com.liyanpeng.jdk8.growing.jdk8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Nashorn JavaScript引擎
 */
public class NashornDemo {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        System.out.println(manager);
        System.out.println(engine);
        System.out.println(engine.getClass().getName());
//        System.out.println("Result:" + engine.eval("function f() { return 1; }; f() + 1;＂));


    }
}
