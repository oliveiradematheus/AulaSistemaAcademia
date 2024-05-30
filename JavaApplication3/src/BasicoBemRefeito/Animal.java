/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicoBemRefeito;

/**
 *
 * @author aluno
 */
abstract class Animal {

    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    } 
    
    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void fazerBarulho() {
        System.out.println("");
    };
}
