/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gateentrymanagementsystem;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Log {
     private String logFileName;

    public Log(String logFileName) {
        this.logFileName = logFileName;
    }

    public void writeLog(String message) {
        try {
            FileWriter writer = new FileWriter("D://" + this.logFileName, true);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            writer.write(dtf.format(now) + " " + message + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.print("Error while writing log: " + e.getMessage());
        }
    }
}

