/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas20;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class Main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double SaldoAwal, Bunga, SaldoTarget;
        
        System.out.println("==============Program Bunga=======");
       
        System.out.println("Saldo Awal : ");
        SaldoAwal = Keyboard.nextDouble();

        System.out.println("Saldo Target : ");
        SaldoTarget = Keyboard.nextInt();

        System.out.println("Besaran Bunga : ");
        Bunga = Keyboard.nextDouble()/100;
        
        //Make IDR Currency
        Locale localeID = new Locale("in", "ID");
        NumberFormat Rupiah = NumberFormat.getCurrencyInstance(localeID);
        Rupiah.setMaximumFractionDigits(0);
        Rupiah.setMinimumFractionDigits(0);
        
        var i = 0;
        
        while(SaldoAwal<=SaldoTarget){
            SaldoAwal = Math.floor(Bunga*SaldoAwal+SaldoAwal);
            String SaldoAwalRupiah = Rupiah.format(SaldoAwal);
            System.out.println("Saldo di bulan ke-"+(i+1)+" "+SaldoAwalRupiah);
            i++;
        }
        
    }
    
}
