package org.example.factory.multi;

import org.example.factory.single.BlackHuman;
import org.example.factory.single.Human;

public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}