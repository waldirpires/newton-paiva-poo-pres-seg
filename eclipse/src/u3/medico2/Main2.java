package seg.u3.medico2;

import seg.u3.medico.pai.Medico;

public class Main2 {

    public static void main(String[] args) {
        var medico = new Medico("crm-123456");
        System.out.println(medico);
        
        System.out.println("CRM: " + medico.getCrm()); // acesso 

        medico.vestir();
        medico.atender();

    }

}
