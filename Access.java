/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gateentrymanagementsystem;

/**
 *
 * @author HP
 */
public class Access {
     protected String cardID;
    protected Log log;

    public Access(String logFileName) {
        this.log = new Log(logFileName);
    }

    public void logEntry(String message) {
        log.writeLog(message);
    }

    public boolean validateEntry() {
        return false;  // Default method for validation, to be overridden by subclasses
    }
}