package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable{
    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    static final int MAX_PERIPHERAL = 3;
    private Peripheral[] peripherals = new Peripheral[MAX_PERIPHERAL];
    private int peripheralIndex = 0;

    public ComputerSystem() {
    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
        if(peripheralIndex < MAX_PERIPHERAL){
            peripherals[peripheralIndex] = peripheral;
            peripheralIndex++;
        } else {
            throw new TooManyPeripheralsException();
        }
    }

    public int getNumberOfPeripherals(){
        return 0;
    }

    public double totalPriceIncl() {
        return 0;
    }

    public double totalPriceExcl(){
        return 0;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(Peripheral[] peripherals) {
        this.peripherals = peripherals;
    }


    public void removePeripheral(String articleNumber) {
    }
}
