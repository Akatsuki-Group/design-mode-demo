package org.example.strategy.demo1;

import org.example.strategy.demo1.IStrategy;

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
