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
public class PosisiKarakterGame {
    public enum state{
        Tengkurap,
        Jongkok,
        Berdiri,
        Terbang
    }

    private state nowState = state.Berdiri;

    public void btnPressed(String btn) {
        switch (btn) {
            case "tombolS":
                switch (nowState) {
                    case Jongkok:
                        nowState = state.Tengkurap;
                        break;
                    case Berdiri:
                        nowState = state.Jongkok;
                        break;
                    case Terbang:
                        nowState = state.Berdiri;
                        break;
                    default:
                        break;
                }
                break;
            case "tombolW":
                switch (nowState) {
                    case Tengkurap:
                        nowState = state.Jongkok;
                        break;
                    case Jongkok:
                        nowState = state.Berdiri;
                        break;
                    case Berdiri:
                        System.out.println("Posisi Take Off");
                        nowState = state.Terbang;
                        break;
                    default:
                        break;
                }            
                break;
            case "tombolX":
                switch (nowState) {
                    case Terbang:
                        System.out.println("Posisi Landing");
                        nowState = state.Jongkok;
                        break;                
                    default:
                        break;
                }
                break;
        }
    }

    public String getState() {
        return nowState.toString();
    }

}