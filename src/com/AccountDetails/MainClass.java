package com.AccountDetails;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Please Enter your name : ").trim();

        JOptionPane.showMessageDialog(null, "Hello!!! " + userName);
        while (true) {
            String day;
            float temp, speedOfWinds;
            try {
                day = getDay();
                temp = getFloat("Ener the temperature for " + day);
                speedOfWinds = getFloat("Enter the wind speed in Km/h");
            } catch (NullPointerException e) {
                System.out.println("thank you!");
                return;
            }


            int input = JOptionPane.showConfirmDialog(null, "Do you want to calculate for another day");

            if (input != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }

    public static String getDay() {
        return JOptionPane.showInputDialog("Please enter the day").trim();
    }

    public static float getFloat(String prompt) {
        float temperature = 0;
        return temperature;
    }
}

