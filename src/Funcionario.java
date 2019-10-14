public class Funcionario {
    
    //Atributos
    private String nome;
    private String matricula;
    
    //Método Construtor
    public Funcionario (String n, String m) {
        this.setNome(n);
        this.setMatricula(m);
    }
    
    //Métodos Getters e Setters
    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setMatricula (String m) {
        this.matricula = m;
    }
    
    public String getMatricula () {
        return this.matricula;
    }
    
}
