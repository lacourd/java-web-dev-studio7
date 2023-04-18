package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {

    int data;
    int storageCapacity;

    String name;

    String discType;
    int spinSpeed;

    public BaseDisc(String name, int data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public void spinDisc() {
        System.out.println("This " + this.discType + " spins at a rate of " + this.spinSpeed + " RPM.");
    }

    @Override
    public void writeData(int newData) {
        if (this.data + newData < storageCapacity) {
            this.data += newData;
            System.out.println(newData + " MB of data written to disc. Total data on disc: " + this.data + " MB.");
        }
        else {
            System.out.println("Not enough capacity to write new data to disc.");
        }
    }

    @Override
    public int getData() {
        return this.data;
    }

    @Override
    public void getInfo() {
        System.out.println("Title: " + this.name +
                "\nDisc type: " + this.discType +
                "\nData used: " + this.data + " MB" +
                "\nDisc capacity: " + this.storageCapacity + " MB");
    }

    @Override
    public void readData() {
        System.out.println("Your data is being loaded.");
    }
}
