package org.example.strategy.demo1;

import org.example.strategy.demo1.IStrategy;

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
