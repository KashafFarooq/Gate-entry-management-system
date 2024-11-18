/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gateentrymanagementsystem;

/**
 *
 * @author HP
 */
public class StudentAccess extends Access {
      private String[] allowedIds;

    public StudentAccess(String[] allowedIds, String logFileName) {
        super(logFileName);  // Call the parent class constructor
        this.allowedIds = allowedIds;
    }

    @Override
    public boolean validateEntry() {
        // Student-specific validation logic
        for (String allowedId : allowedIds) {
            if (cardID.equals(allowedId)) {
                logEntry("New entry by student card " + this.cardID);
                return true;
            }
        }
        return false;
    }
}
