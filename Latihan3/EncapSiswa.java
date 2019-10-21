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
public class EncapSiswa {

    private String name;
    private String address;
    private String ultah;
    private int age;
    private String hp;

    public int getAge() {
        return age;
    }

    public String getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getUltah() {
        return ultah;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setHp(String newHp) {
        hp = newHp;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void setUltah(String newUltah) {
        ultah = newUltah;

    }
}
