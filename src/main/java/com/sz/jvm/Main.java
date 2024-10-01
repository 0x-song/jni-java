package com.sz.jvm;

/**
 * @Author
 * @Date 2024-09-29 22:49
 * @Version 1.0
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String property = System.getProperty("java.library.path");
        System.out.println(property);
    }
}