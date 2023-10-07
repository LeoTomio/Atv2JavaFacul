public class FuncionarioMedio extends Funcionario {

    public FuncionarioMedio(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public void setInformacoes(String instituicao) {
        setEscolaridade("Ensino Médio");
        setInstituicao(instituicao);
        // Cálculo do salário para Ensino Médio
        setSalario((getSalario() * 1.1) * 1.5);
    }
}