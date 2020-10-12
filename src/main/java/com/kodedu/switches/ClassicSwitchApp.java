package com.kodedu.switches;

public class ClassicSwitchApp {

    public static void main(String[] args) {
        VehicleType vehicleType = VehicleType.AUTOMOBILE;

        int speedLimit = -1;
        switch (vehicleType) {
            case BIKE:
            case SCOOTER:
                speedLimit = 40;
                break;
            case MOTORBIKE:
            case AUTOMOBILE:
                speedLimit = 140;
                break;
            case TRUCK:
                speedLimit = 80;
                break;
            default:
                throw new IllegalStateException("No case found for: " + vehicleType);
        }

        System.out.println("Speed limit: " + speedLimit);
    }
}
