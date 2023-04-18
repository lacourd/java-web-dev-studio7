package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD myCD = new CD("Between the Heart and the Synapse", 650);
        DVD myDVD = new DVD("Memento", 4000);

        System.out.println("\n*****\nCD");
        myCD.spinDisc();
        myCD.readData();
        System.out.println(myCD.getData());
        myCD.getInfo();
        myCD.writeData(600);
        myCD.writeData(6);

        System.out.println("\n*****\nDVD");
        myDVD.spinDisc();
        myDVD.readData();
        System.out.println(myDVD.getData());
        myDVD.getInfo();
        myDVD.writeData(500);
        myDVD.writeData(500);
    }
}
