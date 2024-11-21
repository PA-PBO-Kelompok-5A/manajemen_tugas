/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author khali
 */
public abstract class Mahasiswa {
    private final String nim;
    private final String name;
    private final String password;

    public Mahasiswa(String nim, String name, String password){
        this.nim = nim;
        this.name = name;
        this.password = password;
    }

    public abstract String getRole();
}
