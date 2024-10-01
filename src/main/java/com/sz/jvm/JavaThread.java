package com.sz.jvm;

/**
 * @Author
 * @Date 2024-10-01 19:07
 * @Version 1.0
 */
public class JavaThread {

    public static void main(String[] args) {
        System.load("E:\\WD\\diy\\JNIDemoJava\\c++\\libJNIDemoC.dll");

        new JavaThread().start();
    }

    //start调用start0
    //start0进一步调用run方法
    public void start(){
        start0();
    }

    private native void start0();

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
