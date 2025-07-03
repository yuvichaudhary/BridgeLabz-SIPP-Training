package Inheritence;

 class Devices {
        String deviceId;
        String status;

        Devices(String deviceId, String status) {
            this.deviceId = deviceId;
            this.status = status;
        }

        void displayStatus() {
            System.out.println("Device ID: " + deviceId);
            System.out.println("Status: " + status);
        }
    }

    class Thermostat extends Devices {
        double temperatureSetting;

        Thermostat(String deviceId, String status, double temperatureSetting) {
            super(deviceId, status);
            this.temperatureSetting = temperatureSetting;
        }

        void displayStatus() {
            super.displayStatus();
            System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        }
    }

    public class Device {
        public static void main(String[] args) {
            Thermostat thermostat = new Thermostat("T-102", "Online", 22.5);
            thermostat.displayStatus();
        }
    }

