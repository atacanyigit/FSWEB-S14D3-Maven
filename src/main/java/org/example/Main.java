package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CarSkeleton electricCar = new ElectricCar("tesla", "tesla desc",800, 3000);
        CarSkeleton hybridCar = new HybridCar("peugeot", "peugeot desc",1000, 3000,4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("daihatsu", "daihatsu desc",60, 4);


    }
}