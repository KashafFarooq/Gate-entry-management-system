/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gateentrymanagementsystem;

public class GateEntry {

     private Access access;
    private String gateLocationID;
    private String securityPersonID;

    public GateEntry(Access access, String gateLocationID, String securityPersonID) {
        this.access = access;
        this.gateLocationID = gateLocationID;
        this.securityPersonID = securityPersonID;
    }
    public void entryUsingCard(String cardID) {
        access.cardID = cardID;
        boolean accessGranted = access.validateEntry();
        
        if (accessGranted) {
            System.out.println("Access Allowed");
        } else {
            System.out.println("Access Denied");
        }
    }
}
