public class TestaUniversidadeExerc5 {
    
    //Graduaçao
    Graduacao g1 = new Graduacao("Java POO", 6667, "Luciano");
    //Pós Graduação
    PosGrad pG1 = new PosGrad("Vulnerabilidades", 6668, "Fulano");
    //Aluno Especial
    AlunoEspec aEspec1 = new AlunoEspec("Igor", 666, g1, pG1);
    //Aluno de Graduação
    AlunoGrad aG1 = new AlunoGrad("Fernando", 445, g1);
    //Aluno de Pós Graduação
    AlunoPosGrad aPG1 = new AlunoPosGrad("Cristian", 888, pG1);
}
