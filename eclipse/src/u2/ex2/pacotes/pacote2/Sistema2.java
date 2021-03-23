package u2.ex2.pacotes.pacote2;

import u2.ex2.pacotes.pacote1.Usuario;

public class Sistema2 {

    public static void main(String[] args) {
        var usuario = new Usuario();
        
        usuario.id = 22;
        
        usuario.valor = 10.5f;

        usuario.nome = "josé";
        
        usuario.getNome(); // encapsulamento

    }

}
