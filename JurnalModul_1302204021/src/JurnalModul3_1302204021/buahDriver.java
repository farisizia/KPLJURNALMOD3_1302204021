package JurnalModul3_1302204021;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Faris Izzi Asrori - 1302204021
 */
import java.util.Scanner;
public class buahDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit;
        System.out.print("Masukkan nama buah : ");
        fruit = input.nextLine();
        System.out.printf("Kode buah : %s",KodeBuah.getKodeBuah(fruit));
        input.close();
    }
}