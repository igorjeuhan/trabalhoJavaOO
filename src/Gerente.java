public class Gerente extends Funcionario {
    
    public Gerente (String n, String m, String depResp) {
        super(n, m);
        this.setDepRes(depResp);
    }
    
    //Atributos
    String depResp;
    
    //Métodos Getters e Setters
    public void setDepRes (String depResp) {
        this.depResp = depResp;
    }
    
    public String getDepResp () {
        return this.depResp;
    }
    
}
