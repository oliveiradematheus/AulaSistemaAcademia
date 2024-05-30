
package BasicoBemRefeito;


public class Main {

    public static void main(String[] args) {
        Usuário user1 = new Usuário ();
        Usuário user2 = new Usuário ();
        
        user1.setNome ("Matheus");
        user1.setIdade(19);
        user1.setEndereço("Bae city");
        
        user2.setNome("Caio");
        user2.setIdade (19);
        user2.setEndereço("Bae city");
        
        user1.ImprimirInformações();
        user2.ImprimirInformações();
    }
}
    

