package u3.medico;

import u3.medico.pai.Medico;

public class Oftalmologista extends Medico{ 

    private String cro;
    
    public Oftalmologista(String cro, String crm) {
        super(crm); // construtor da superclasse
        this.cro = cro;
    }
    
    public String getCro() {
        return cro;
    }

    @Override
    public String toString() {
        return "Oftalmologista [cro=" + cro + ", crm=" + crm + "]";
    }
    
    @Override
    public void atender() {
        System.out.println("Oftalmologista: atendendo paciente no olho.");
    }
    
}
