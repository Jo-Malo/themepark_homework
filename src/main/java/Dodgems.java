public class Dodgems extends Ride {

    public Dodgems(int price, int minimumAge, double minimumHeight){
        super(price, minimumAge, minimumHeight);
    }

    public String getRideWarningNotice(){
        return "All customers please check that you qualify to enter this ride and are " + minimumAge + " years of age.";
    }

}
