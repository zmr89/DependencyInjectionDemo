package com.example.dependencyinjectiondemo;

import dagger.Module;
import dagger.Provides;

@Module
public class LithiumIonBatteryModule {

    @Provides
    CarBattery provideCarBattery(LithiumIonBattery lithiumIonBattery){
        lithiumIonBattery.logBatteryType();
        return lithiumIonBattery;
    }

}
