package org.allvehicle;

import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;
import org.fourwheeler.FourWheeler;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle = new Vehicle();
        TwoWheeler two = new TwoWheeler();
        ThreeWheeler three = new ThreeWheeler();
        FourWheeler four = new FourWheeler();

        vehicle.vehicleNecessary();

        two.bike();
        two.cycle();

        three.auto();

        four.car();
        four.bus();
        four.lorry();
    }

    public void vehicleNecessary() {
        System.out.println("Vehicle Necessary");
    }

}
