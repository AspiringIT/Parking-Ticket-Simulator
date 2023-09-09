public class ParkedCar {
    private String make;
    private String model;
   private String color;
    private  String licensenumber;
    private  int minutesparked;
    private String licenseNumr;

    public  ParkedCar(String make, String model, String color, String licenseNum, int minparked){


        this.make = make;
        this.model = model;
        this.color = color;
        this.licensenumber = licenseNum;
        this.minutesparked = minparked;
    }

    public int getMinutesparked() {
        return minutesparked;
    }
}
