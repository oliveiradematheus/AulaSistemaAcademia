 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicobemfeito;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] arg) {
        Gato gato1 = new Gato ("NomedoGato", "preto");
        Cachorro cachorro1 = new Cachorro ("ApelidoCachorro", "RaçaCachorro");
        
        System.out.println ("Barulho Gato");
        gato1.fazerBarulho();
        
        System.out.println("Barulho cachorro");
        cachorro1.fazerBarulho();
    }

    public void atividade1() {
        Pessoa pessoa1 = new Pessoa("Matheus", 19, "Endereço");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("NomePessoa2");
        pessoa2.setIdade(20);
        pessoa2.setEndereço("EndereçoPessoa2");

        System.out.println("Dados pessoa 1");
        pessoa1.ImprimirInformações();

        System.out.println("Dados Pessoa 2");
        pessoa2.ImprimirInformações();
    }
    
    
}
