/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.Latihan2;

/**
 *
 * @author grand
 */
public class Bus {

    private int penumpang;
    private int maxPenumpang;

    //konstruksi kelas Bis
    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;

    }

    //nethod untuk menambahkan penumpang

    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }

    }

    public void cetak() {
        System.out.println("Penumpang bis : " + penumpang);
        System.out.println("Penumpang maximum bis : " + maxPenumpang);

    }

}
