/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicoBemRefeito;

/**
 *
 * @author aluno
 */
public class Cachorro extends Animal  {
    private String raça;
    private int patas;

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    
    
    
}

