package pl.fane.gof.structual.facade.model;

import pl.fane.gof.structual.facade.model.legacy.LegacyOne;
import pl.fane.gof.structual.facade.model.legacy.LegacyTwo;

public class Facade {

    private final LegacyOne legacyOne;
    private final LegacyTwo legacyTwo;

    public Facade() {
        legacyOne = new LegacyOne();
        legacyTwo = new LegacyTwo();
    }

    public void complicadedStuff(){
        legacyOne.doThat();
        legacyTwo.legacyStuff();
        legacyOne.doThis();
    }
}
