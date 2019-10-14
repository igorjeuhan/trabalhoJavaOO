public class AssisAdm extends Funcionario {
    
    public AssisAdm (String n, String m, Gerente spv) {
        super(n, m);
        this.setSupervisor(spv);
    }
    
    //Atributos
    Gerente supervisor;
    double adcNoturno;
    
    //Métodos Getters e Setters
    public void setSupervisor (Gerente spv){
        this.supervisor = spv;
    }
    
    public Gerente getSupervisor () {
        return this.supervisor;
    }
    
    public void setAdcNoturno (double adcN) {
        this.adcNoturno = adcN;
    }
    
    public double getAdcNoturno () {
        return this.adcNoturno;
    }
    
}
