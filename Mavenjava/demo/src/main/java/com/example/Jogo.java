package com.example;
public class Jogo {
    public static void main(String[] args) {
        Personagem cacador = new Personagem();
        cacador.nome = "Aragorn";
        while (true) {
            cacador.cacar();
            cacador.comer();
            cacador.cacar();
            cacador.cacar();
            cacador.cacar();
            cacador.cacar();
            cacador.dormir();
            System.out.println("====================");
        }

    }
}
