package seg.u3.Atvi2.banco;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        var banco = new Banco("Newton Paiva");
        
        var conta1 = new ContaBancaria("0001");
        var conta2 = new ContaBancaria("0002");
        
        banco.inserirConta(conta1);
        banco.inserirConta(conta2);
        
        // pesquisar por conta
        var achou = banco.pesquisar("0001");
        
        System.out.println(achou);
        
        var menu = new MenuContaBancaria();
        
        menu.executar(conta1);
        
    }

}
