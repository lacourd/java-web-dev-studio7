package org.launchcode.studio7;

public class DVD extends BaseDisc {


    public DVD(String name, int data) {
        super(name, data);
        this.discType = "DVD";
        this.spinSpeed = 1600;
        this.storageCapacity = 4700;
    }
}
