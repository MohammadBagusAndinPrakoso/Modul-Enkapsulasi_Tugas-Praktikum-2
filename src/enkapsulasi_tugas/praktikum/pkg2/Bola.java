/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi_tugas.praktikum.pkg2;

/**
 *
 * @author MOKLET1
 */
public class Bola {
    public double jariJari;
    
    protected void setJarijari(){
        System.out.print("Masukkan Jari-Jari Bola (satuan cm) : ");
    }
    
    protected void showDiameter(){
        double d = jariJari * 2;
        System.out.println("Diameter Bola adalah " +d + " cm");
    }
    
    protected void showLuasPermukaan(){
        double luas = 4 * Math.PI * jariJari * jariJari;
        System.out.println("Luas Permukaan Bola adalah " +luas + " cm");
    }
    
    protected void showVolume(){
        double volume;
        volume = Math.PI * jariJari * jariJari * jariJari * 4 / 3;
        System.out.println("Volume Bola adalah " +volume + " cm");
    }
    
}
