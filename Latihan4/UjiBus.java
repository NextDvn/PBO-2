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
public class UjiBus {

    public static void main(String[] abc) {
        Bus Bus = new Bus(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
//penambahan penumpang
        Bus.addpenumpang(1);
        Bus.cetakpenumpang();
//penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
//penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
//penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
    }
}
