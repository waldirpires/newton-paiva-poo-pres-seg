package seg.u3.medico;

import seg.u3.medico.pai.Cardiologista;
import seg.u3.medico.pai.Medico;

public class Main {

    public static void main(String[] args) {

        var medico = new Medico("crm-123456");
        System.out.println(medico);
        
        //System.out.println("CRM: " + medico.crm);
        
        medico.vestir();
        medico.atender();
        
//        var oftalmo = new Oftalmologista("cro-54321", "crm-56789");
//        System.out.println(oftalmo);
//        
//        oftalmo.vestir();
//        oftalmo.atender();
//        
//        var cardio = new Cardiologista("crm-67854", "crc-34521");
//        System.out.println(cardio);
//        
//        cardio.vestir();
//        cardio.atender();
        
        System.out.println("\n\n");
        
        Medico medico2 = new Cardiologista("crm-67834", "crc-345222");
        System.out.println(medico2);
        
        medico2.vestir();
        medico2.atender();
        
    }

}
