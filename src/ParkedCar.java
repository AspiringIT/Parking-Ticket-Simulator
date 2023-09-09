public class ParkedCar {
    private String make;
    private String model;
   private String color;
    private  String licensenumber;
    private  int minutesParked;

    public  ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked){


        this.make = make;
        this.model = model;
        this.color = color;
        this.licensenumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    public int getMinutesparked() {
        return minutesParked;
    }

    public String getmake(){return make;}

    public String getmodel(){return model;}

    public String getColor(){return color;}

    public String getlicenseNumber(){return licensenumber;}

    public int getMinutesParked(){
        return minutesParked;
    }

}
