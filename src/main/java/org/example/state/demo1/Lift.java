package org.example.state.demo1;

public class Lift implements ILift {
    //电梯门关闭
    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    //电梯门开启
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    //电梯开始运行起来
    @Override
    public void run() {
        System.out.println("电梯上下运行起来...");
    }

    //电梯停止
    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
