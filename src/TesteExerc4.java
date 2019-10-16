public class TesteExerc4 {
    
    public static void main(String[] args) {
        
        //Pessoa
        Pessoa p1 = new Pessoa ("Igor", "Rua rueira, bairro barreiro, n 222", 123456789);
        //Fornecedor
        Fornecedor f1 = new Fornecedor("Carlos", "Rua rueira, bairro barreiro, n 333", 123456789, 2500.00, 300.00);
        //Empregado
        Empregado e1 = new Empregado("Pedro", "Rua rueira, bairro barreiro, n 444", 123456789, 666, 2500.00, 10);
        //Administrador
        Administrador a1 = new Administrador("José", "Rua rueira, bairro barreiro, n 555", 123456789, 667, 5000.00, 15, 500.00);
        //Operário
        Operario op1 = new Operario("Fernando", "Rua rueira, bairro barreiro, n 2562", 123456789, 555, 1200.00, 10, 15, 5);
        
        System.out.println("Saldo do fornecedor: " + f1.obterSaldo() + "\n");
        System.out.println("Cálculo do salário do empregado: " + e1.calcularSalario() + "\n");
        System.out.println("Cálculo do salário do administrador: " + a1.calcularSalario() + "\n");
        System.out.println("Cálculo do salário do operário: " + op1.calcularSalario());
        
    }
}
