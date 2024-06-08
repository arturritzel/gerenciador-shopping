public class Loja {

  // atributos padrão
  private String nome;
  private int quantidadeFuncionarios;
  private float salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;

  // construtores
  public Loja(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
      Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
  }

  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
    this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao);
  }

  // getters/setters
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidadeFuncionarios() {
    return this.quantidadeFuncionarios;
  }

  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public float getSalarioBaseFuncionario() {
    return this.salarioBaseFuncionario;
  }

  public void setSalarioBaseFuncionario(float salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public Endereco getEndereco() {
    return this.endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Data getDataFundacao() {
    return this.dataFundacao;
  }

  public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
  }

  // métodos
  public float gastosComSalario() {
    if (this.salarioBaseFuncionario > -1)
      return this.quantidadeFuncionarios * this.salarioBaseFuncionario;

    else
      return -1;
  }

  public char tamanhoDaLoja() {
    if (this.quantidadeFuncionarios < 10)
      return 'P';
    else if (this.quantidadeFuncionarios <= 30)
      return 'M';
    else
      return 'G';
  }

  @Override
  public String toString() {
    if (this.salarioBaseFuncionario > -1) // caso o salário esteja definido
      return "Loja: " + this.nome + ", com " + this.quantidadeFuncionarios + " funcionários e um salário base de R$ "
          + this.salarioBaseFuncionario + " (R$ " + this.gastosComSalario()
          + " mensais). A loja fica localizada no endereço " + this.endereco.toString() + " e foi fundada em "
          + this.dataFundacao.toString();

    else // caso o salário não esteja definido
      return "Loja: " + this.nome + ", com " + this.quantidadeFuncionarios
          + " funcionários. Salário base não definido. A loja fica localizada no endereço " + this.endereco.toString()
          + " e foi fundada em " + this.dataFundacao.toString();
  }

}