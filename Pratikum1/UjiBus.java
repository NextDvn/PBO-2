/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.Pratikum1;

/**
 *
 * @author grand
 */
public class UjiBus {

    public static void main(String[] args) {
        
        Bus bus = new Bus(100);
        bus.cetakpenumpang();

        System.out.println("\n");
        bus.getpenumpang(24);
        bus.cetakpenumpang();

        System.out.println("\n");
        bus.getpenumpang(27);
        bus.cetakpenumpang();

        System.out.println("\n");
        bus.getpenumpang(24);
        bus.cetakpenumpang();

        System.out.println("\n");
        bus.getpenumpang(10);
        bus.cetakpenumpang();

        System.out.println("\n");
        bus.getpenumpang(87);
        bus.cetakpenumpang();

        System.out.println("Rata-rata penumpang : " + bus.getAverge() + "kg.");
        System.out.println("Jumlah penumpang sekarang : " + bus.counter());
    }
}
