/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JurnalModul3_1302204021;

/**
 *
 * @author Faris Izzi Asrori_1302204021
 */
public class KodeBuah {
    private enum daftarBuah{
        apel,
        aprikot,
        alpukat,
        pisang,
        paprika,
        blackberry,
        ceri,
        kelapa,
        jagung,
        kurma,
        durian,
        anggur,
        melon,
        semangka        
    }

    public static String[] kodeBuah = {"A00","B00","C00","D00","E00","F00","G00","H00","I00","J00","K00","L00","M00","N00","O00"};

    public static String getKodeBuah(String namaBuah) {
        try {            
            return KodeBuah.kodeBuah[KodeBuah.daftarBuah.valueOf(namaBuah.toLowerCase()).ordinal()];
        } catch (Exception e) {
            return "NOT FOUND";
        }
    }
   
}
// Faris Izzi Asrori - 1302204021