public class FuncionarioBasico extends Funcionario {

    public FuncionarioBasico(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public void setInformacoes(String instituicao) {
        setEscolaridade("Ensino Básico");
        setInstituicao(instituicao);
        // Cálculo do salário para Ensino Básico
        setSalario(getSalario() * 1.1);
    }
}