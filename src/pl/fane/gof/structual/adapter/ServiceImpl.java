package pl.fane.gof.structual.adapter;

import pl.fane.gof.structual.adapter.legacy.LegacyClass;
import pl.fane.gof.structual.adapter.legacy.LegacyInterface;

public class ServiceImpl implements Service {

    LegacyInterface legacyInterface = new LegacyClass();

    @Override
    public void serviceMe() {
        legacyInterface.doThat();
        legacyInterface.andDoThisToo();
    }
}
