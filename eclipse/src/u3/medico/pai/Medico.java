package seg.u3.medico.pai;

public class Medico {

    protected String crm; // modificador de acesso para subclasses

    /**
     * @param crm
     */
    public Medico(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void atender() {
        System.out.println("Médico atendendo . . .");
    }

    public void vestir() {
        System.out.println("Vestindo roupa branca - jaleco . . .");
    }

    @Override
    public String toString() {
        return "Medico [crm=" + crm + "] " + super.toString();
    }
}
