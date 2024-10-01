package com.sz.jvm;

/**
 * @Author
 * @Date 2024-09-29 22:53
 * @Version 1.0
 * 1.编写native方法
 * 2.在src父目录下执行编译操作
 * javac .\src\main\java\com\sz\jvm\NativeMethod.java -h ./jni
 * 3.在src同级目录生成了jni目录
 */
public class NativeMethod {

    public static native String hello();


    public static void main(String[] args) {
        //load和loadLibrary的区别在于load填入绝对路径；loadLibrary从java.library.path环境变量处读取
        System.load("E:\\WD\\diy\\JNIDemoJava\\c++\\libJNIDemoC.dll");
        String hello = NativeMethod.hello();
        System.out.println(hello);
    }
}
