public class ParkingTicket {
    private static ParkedCar vehicle;
    private int Fine;
    private String officername;
    private String BadgeNumber;
    public void parkingticket(ParkedCar vehicle, int fine, String officerName, String BadgeNumber) {
        this.vehicle = vehicle;
        this.Fine = fine;
        this.officername = officerName;
        this.badgenumber = BadgeNumber;

    }
    public static ParkingTicket CheckVehicle(ParkedCar Vehicle, ParkingMeter meter){
        if (vehicle.getMinutesparked() > meter.getPurchasedMinutes()) {
            int timeover = vehicle.getMinutesParked();
            int fine = 25 + (timeover / 60) * 10;
            return new ParkingTicket(vehicle, fine, name, BadgeNumber);
        }
        else{
            return null;
            }
        }
    }



