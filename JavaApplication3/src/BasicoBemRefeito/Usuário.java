/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicoBemRefeito;

/**
 *
 * @author aluno
 */
public class Usuário {

    private String nome;
    private int idade;
    private String endereço;

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

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void ImprimirInformações() {
        System.out.println("nome: " + nome + ", idade: " + idade + ", endereço: " + endereço);
       
    }
}
