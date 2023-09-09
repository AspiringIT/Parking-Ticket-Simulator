public class PoliceOfficer {
    private String name;
    private String BadgeNumber;

    public PoliceOfficer(String Name, String badgenumber){
        this.name = Name;
        this.BadgeNumber = badgenumber;

    }
    public static String getofficername(){
        return name;
    }

    public static String getBadgeNumber(){
        return BadgeNumber;
    }
}
