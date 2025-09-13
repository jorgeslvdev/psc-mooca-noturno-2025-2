package com.example;
import java.lang.Math;

public class Personagem {
String nome;
int energia = 10;
int fome = 0;
int sono = 0;


public void cacar() {
    if (energia >= 2) {
    } else {
        System.out.println("O personagem está muito cansado para caçar.");
    }
    fome = Math.min(fome + 1, 10);
    sono = Math.min(sono + 1, 10);
}

public void comer() {
    if (fome >= 1) {
        System.out.println("O personagem está comendo");
        energia = Math.min(energia + 1, 10);
        fome = fome - 1;
    } else {
        System.out.println("O personagem não está com fome");
    }
}

public void dormir() {
   if (sono >= 1) {
    System.out.println("O personagem está dormindo");
    sono -= 1;
  //  energia = Math.min(energia + 1, 10);
    energia = energia + 1 <= 10 ? energia + 1 : 10;


    } else {
        System.out.println("O personagem não está com sono");
    }
}
}
