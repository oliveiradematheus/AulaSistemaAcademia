/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicobemfeito;

/**
 *
 * @author aluno
 */
public class Cachorro extends Animal {
    
    String apelido;
    String raça;
    
     public Cachorro (String apelido, String raça) {
        this.apelido = apelido;
        this.raça = raça;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("latido");
    }

    @Override
    public void nomedoAnimal() {
        
    }
}
