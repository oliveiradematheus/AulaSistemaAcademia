/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicobemfeito;

import java.util.Locale;

/**
 *
 * @author aluno
 */
public class Gato extends Animal {
    
    String nome;
    String cor;
    
    public Gato (String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    @Override
    public void fazerBarulho() {
            System.out.println("miado");
    }

    @Override
    public void nomedoAnimal() {
    }
}
