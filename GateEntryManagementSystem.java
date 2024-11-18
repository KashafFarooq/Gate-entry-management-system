/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gateentrymanagementsystem;

/**
 *
 * @author HP
 */
public class GateEntryManagementSystem {

    public static void main(String[] args) {
      
        String[] students = {"11-AB", "11-JKL"};
        String location = "mainGate1";
        String securityPersonID = "rvx21";

        // Create a StudentAccess instance (using inheritance)
        StudentAccess studentAccess = new StudentAccess(students, "log.txt");
        GateEntry entry = new GateEntry(studentAccess, location, securityPersonID);

        // Validate student access directly using GateEntry
        entry.entryUsingCard("11-JKL");  // Valid student ID
        entry.entryUsingCard("11-XYZ");  // Invalid student ID
    }
}
  