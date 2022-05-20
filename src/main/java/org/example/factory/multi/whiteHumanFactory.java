package org.example.factory.multi;

import org.example.factory.single.Human;
import org.example.factory.single.WhiteHuman;

public class whiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}