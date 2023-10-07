public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        double gastosTotal = 0;
        double gastosEnsinoBasico = 0;
        double gastosEnsinoMedio = 0;
        double gastosEnsinoSuperior = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            String nome = "Funcionario " + (i + 1);
            int codigo = 1001 + i;

            if (i <= 3) {
                FuncionarioBasico funcionarioBasico = new FuncionarioBasico(nome, codigo);
                funcionarioBasico.setInformacoes("Escola " + (i + 1));
                gastosEnsinoBasico += funcionarioBasico.getSalario();
                funcionarios[i] = funcionarioBasico;
            } else if (i <= 7) {
                FuncionarioMedio funcionarioMedio = new FuncionarioMedio(nome, codigo);
                funcionarioMedio.setInformacoes("Escola " + (i + 1));
                gastosEnsinoMedio += funcionarioMedio.getSalario();
                funcionarios[i] = funcionarioMedio;
            } else {
                FuncionarioSuperior funcionarioSuperior = new FuncionarioSuperior(nome, codigo);
                funcionarioSuperior.setInformacoes("Universidade " + (i + 1));
                gastosEnsinoSuperior += funcionarioSuperior.getSalario();
                funcionarios[i] = funcionarioSuperior;
            }

            gastosTotal += funcionarios[i].getSalario();
            funcionarios[i].infoFuncionario();
        }

        System.out.println("Gastos com Ensino Básico: " + gastosEnsinoBasico);
        System.out.println("Gastos com Ensino Médio: " + gastosEnsinoMedio);
        System.out.println("Gastos com Ensino Superior: " + gastosEnsinoSuperior);
        System.out.println("O gasto total da empresa é de " + gastosTotal);


    }
}