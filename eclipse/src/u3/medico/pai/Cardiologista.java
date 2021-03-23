package seg.u3.medico.pai;

public class Cardiologista extends Medico {

    private String crc;
    
    public Cardiologista(String crm, String crc) {
        super(crm);
        this.crc = crc;
    }
    
    public String getCrc() {
        return crc;
    }

    @Override
    public String toString() {
        return "Cardiologista [crc=" + crc + ", crm=" + crm + "]";
    }
    
    public void atender() {
        System.out.println("Cardiologista atendendo o paciente olhando o coração . . .");
    }
    

}
