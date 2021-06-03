/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author MOKLET-1
 */


public class PenerapanConstructordanParameter {
    public String Nama;
    public String Sandi;
    
    public PenerapanConstructordanParameter(String Nama, String Sandi){
        this.Nama = Nama;
        this.Sandi = Sandi;
    }
       
}
class Demo{
    public static void main(String[] args) {
        PenerapanConstructordanParameter aw = new PenerapanConstructordanParameter("Sameeedd", "samasamamanusia");
        System.out.println("Nama : " + aw.Nama);
        System.out.println("Sandi : " + aw.Sandi);
    }
}
