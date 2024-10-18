/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kdv.tutari.hesaplayan.program;

/**
 *
 * @author hekimcanaktas
 */

import  java.util.Scanner;
public class KdvTutariHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double para,kdvOrani,kdvTutari=0,kdvsizTutar = 0,kdvliTutar=0;
        
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ürünün fiyatını giriniz: " );
        
       
        para = scanner.nextDouble();
        if(para<=0) {
            System.out.println("Para miktarı 0 dan büyük olmalı!!");
        }
        else if(para>0 && para<=1000){
                    kdvOrani = (18.0/100);
        kdvsizTutar = para;
        kdvTutari += kdvOrani * kdvsizTutar;
        kdvliTutar = kdvsizTutar + kdvTutari;
        }
        
        else{
            
        
        kdvOrani = (8.0/100);
        kdvsizTutar = para;
        kdvTutari += kdvOrani * kdvsizTutar;
        kdvliTutar = kdvsizTutar + kdvTutari;

        }
        
        
        System.out.println("KDV siz tutar : " + kdvsizTutar);
        System.out.println("KDV li tutar : " + kdvliTutar);
        System.out.println("KDV Tutarı : " + kdvTutari);

        
    }
    
}
