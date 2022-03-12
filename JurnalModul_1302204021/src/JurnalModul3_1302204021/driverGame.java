/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JurnalModul3_1302204021;

import JurnalModul3_1302204021.PosisiKarakterGame;

/**
 * 
 * @author Faris Izzi Asrori - 1302204021
 */
public class driverGame {
    public static void main(String[] args) {
        PosisiKarakterGame g = new PosisiKarakterGame();
        System.out.println(g.getState());
        System.out.println("[tombolS pressed]");g.btnPressed("tombolS");
        System.out.println(g.getState());
        System.out.println("[tombolS pressed]");g.btnPressed("tombolS");
        System.out.println(g.getState());
        System.out.println("[tombolW pressed]");g.btnPressed("tombolW");
        System.out.println(g.getState());
        System.out.println("[tombolW pressed]");g.btnPressed("tombolW");
        System.out.println(g.getState());
        System.out.println("[tombolW pressed]");g.btnPressed("tombolW");
        System.out.println(g.getState());
        System.out.println("[tombolX pressed]");g.btnPressed("tombolX");
        System.out.println(g.getState());

        
    }
}