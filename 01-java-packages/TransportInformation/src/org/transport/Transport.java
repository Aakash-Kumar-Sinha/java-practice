package org.transport;

import org.road.Road;
import org.air.Air;
import org.water.Water;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transport transport = new Transport();
        Road road = new Road();
        Air air = new Air();
        Water water = new Water();

        transport.transportForm();

        road.bike();
        road.cycle();
        road.bus();
        road.car();

        air.aeroPlane();
        air.heliCopter();

        water.boat();
        water.ship();
    }

    public void transportForm() {
        System.out.println("Transport Form");
    }

}
