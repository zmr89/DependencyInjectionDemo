package com.example.dependencyinjectiondemo;

import dagger.Component;

@Component(modules = {CarChassisModule.class, LithiumIonBatteryModule.class})
public interface CarComponent {

//    Car getCar();
}
