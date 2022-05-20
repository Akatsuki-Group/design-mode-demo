package org.example.singleton;

/**
 * 单例模式
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    /**
     * 这个方法比上面有所改进，不用每次都进行生成对象，只是第一次
     * 使用时生成实例，提高了效率！
     *
     * @return
     */
    public static synchronized Singleton2 getInstance() {

        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}