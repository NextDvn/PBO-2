/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.Latihan4;

/**
 *
 * @author grand
 */
public class Bus {

    public int penumpang;
    public int maxpenumpang;

    public Bus(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
//Method Mutator

    public void addpenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getpenumpang(int password) {
        if (password == 24) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }

    public void cetakpenumpang() {
        System.out.println("Punumpang bis : " + penumpang);
        System.out.println("Penumpang maximum bis :" + maxpenumpang);
    }
}
