public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;

    }

    public String getName() {
        return name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public  ParkingTicket inspectCar(ParkedCar car, ParkingMeter meter) {
        int minutesParked = car.getMinutesParked();
        int purchasedMinutes = meter.getPurchasedMinutes();

        if (minutesParked > purchasedMinutes) {
            int timeOver = minutesParked-purchasedMinutes;
            int fine = 25+(timeOver/60)*10;
            return new ParkingTicket(car, fine, name, badgeNumber);}
            else{ return null;}

        }

    }

