/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.alpro__tugas1;
//import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author hp
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat(".00");
        String bb = JOptionPane.showInputDialog("Masukkan berat badan (kg): ");
        int beratbadan = Integer.parseInt(bb);
        String tb = JOptionPane.showInputDialog("Masukkan tinggi badan dalam (m): ");
        double tinggibadan = Double.parseDouble(tb);
        double BMI = beratbadan/(tinggibadan*tinggibadan);
        JOptionPane.showInternalConfirmDialog(null, "BMI nya adalah " + df.format(BMI));
        
    }
    
}
