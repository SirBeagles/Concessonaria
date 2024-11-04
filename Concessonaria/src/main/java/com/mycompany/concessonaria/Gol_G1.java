/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessonaria;

/**
 *
 * @author Aluno-Lab
 */
class Gol_G1 implements Carro{
    @Override
    public double getCost() {
        return 20000;
    }

    @Override
    public String getDescription() {
        return "Gol Quadrado";
    }
}