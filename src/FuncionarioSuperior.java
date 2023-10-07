public class FuncionarioSuperior extends Funcionario {

    public FuncionarioSuperior(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public void setInformacoes(String instituicao) {
        setEscolaridade("Ensino Superior");
        setInstituicao(instituicao);
        // Cálculo do salário para Ensino Superior
        setSalario(((getSalario() * 1.1) * 1.5) * 2.0);
    }
}