package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {
    private double clockspeed;
    private static final double MIN_CLOCKSPEED = 0.7;

    public Processor(String vendor, String name, double price, double clockspeed) {
        super(vendor, name, price);
        setClockspeed(clockspeed);
    }

    @Override
    public String getFullDescription() {
        return super.getFullDescription()
                + "Clock speed = " + clockspeed + "GHz";
    }

    public void setProcessor(){

    }

    public void getProcessor(){}

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        this.clockspeed = clockspeed;
    }
}
