public class ParkingTicket {
    private  ParkedCar parkedCar;
    private int fine;
    private String officerName;
    private String badgeNumber;
    public ParkingTicket(ParkedCar parkedCar, int fine, String officerName, String badgeNumber) {
        this.parkedCar = parkedCar;
        this.fine = fine;
        this.officerName = officerName;
        this.badgeNumber = badgeNumber;

    }
    public ParkedCar getParkedCar(){return parkedCar;}

    public int getFine(){return fine;}

    public String getOfficerName(){return officerName;}

    public String getbadgeNumber(){return badgeNumber;}

    }



