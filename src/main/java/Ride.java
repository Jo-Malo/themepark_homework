public abstract class Ride {

    private int price;
    public int minimumAge;
    private double minimumHeight;

    public Ride(int price, int minimumAge, double minimumHeight){
        this.price = price;
        this.minimumAge = minimumAge;
        this.minimumHeight = minimumHeight;
    }

    public int getPrice(){
        return this.price;
    }

    public int getMinimumAge(){
        return this.minimumAge;
    }

    public double getMinimumHeight(){
        return this.minimumHeight;
    }

    public abstract String getRideWarningNotice();

}
