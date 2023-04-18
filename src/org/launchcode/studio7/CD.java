package org.launchcode.studio7;

public class CD extends BaseDisc {


    public CD(String name, int data) {
        super(name, data);
        this.discType = "CD";
        this.spinSpeed = 500;
        this.storageCapacity = 700;
    }
}
