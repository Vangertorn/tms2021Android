package com.home;

import com.home.Models.CargoTransport;
import com.home.Models.CivilAirTransport;
import com.home.Models.MilitaryAirTransport;
import com.home.Models.PassengerTransport;

public class Main {
    public static void main(String[] args) {
        CivilAirTransport plant1 = new CivilAirTransport(10800, 750, 14000, "Boing",
                12, 150, 320, true);
        MilitaryAirTransport fighter1 = new MilitaryAirTransport(55000, 2500, 16680,
                "Mig29", 11.36, 55, true, (byte) 9);
        CargoTransport cargo1 = new CargoTransport(460, 82, 8300,
                "VolvoFH", (byte) 4, 30.5, 40);
        PassengerTransport auto1 = new PassengerTransport(150, 150, 1700,
                "Toyota", (byte) 4, 8.5, "Hatchback", (short) 5);

//        plant1.info();
//        fighter1.info();
//        cargo1.info();
//        auto1.info();
//        auto1.kilometrage(60);
//        fighter1.catapult();
//        for (int i=0; i<12;i++){
//            fighter1.shot();
//        }
//        plant1.checkingForCapacity(45);
//        cargo1.checkingForCapacity(41);


    }
}
