package org.example.factory.multi;

import org.example.factory.single.Human;
import org.example.factory.single.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}