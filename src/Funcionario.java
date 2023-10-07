public abstract class Funcionario {

    private String nome;
    private int codigoFuncional;
    private String escolaridade;
    private String instituicao;
    private double salario;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.escolaridade = "";
        this.instituicao = "";
        this.salario = 1000.0;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void infoFuncionario() {
        System.out.println("Nome -> " + nome);
        System.out.println("Codigo -> " + codigoFuncional);
        System.out.println("Escolaridade -> " + escolaridade);
        System.out.println("Instituição -> " + instituicao);
        System.out.println("Salário -> " + salario);
        System.out.println("");
    }

    // Método abstrato que faz o calculo do salário
    public abstract void setInformacoes(String instituicao);
}