package com.denglitong;

/**
 * private native void start0();
 * native 修饰符表示这个方法是由 JVM 虚拟机内部的 C 代码实现的，不是由 Java 代码实现的
 *
 * @author litong.deng@foxmail.com
 * @date 2021/6/17
 */
public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();

        thread = new MyThread();
        thread.start();

        thread = new Thread(() -> {
            System.out.println("start new thread lambda");
        });
        thread.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("start new Thread");
    }
}
