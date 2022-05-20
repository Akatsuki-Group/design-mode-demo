package org.example.singleton;

/**
 * 单例模式
 */
public class Singleton {
    private Singleton() {
    }

    /**
     * 在自己内部定义自己一个实例，是不是很奇怪？
     * 注意这是 private 只供内部调用
     */
    private static Singleton instance = new Singleton();

    /**
     * 这里提供了一个供外部访问本 class 的静态方法，可以直接访问
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
} 