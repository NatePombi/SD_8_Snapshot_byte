package com.arithmatrix.snapshot;

public class SnapshotApplication {

    public void start() throws InterruptedException {
        System.out.println("***********************************************");
        System.out.println("\t\t\t\tSNAPSHOT");
        System.out.println("***********************************************");
        System.out.print("\t\tSnapshot application starting.");
        for(int i = 0 ; i<4;i++){
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println();
    }
}
