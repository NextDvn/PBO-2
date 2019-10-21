/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.Latihan3;

/**
 *
 * @author grand
 */
public class TesSiswa {

    public static void main(String[] args) {

        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Gregorius Devon Bramantyo");
        siswa.setAddress("Malang");
        siswa.setAge(15);
        siswa.setUltah("09-09-2004");
        siswa.setHp("081336267047");

        System.out.println("Nama : " + siswa.getName());
        System.out.println("Age :" + siswa.getAge());
        System.out.println("Address : " + siswa.getAddress());
        System.out.println("Ultah : " + siswa.getUltah());
        System.out.println("NO HP :" + siswa.getHp());

    }
}
