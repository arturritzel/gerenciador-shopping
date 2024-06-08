public class Produto {

  // atributos padrão
  private String nome;
  private float preco;
  private Data dataValidade;

  // construtores
  public Produto(String nome, float preco, Data dataValidade) {
    this.nome = nome;
    this.preco = preco;
    this.dataValidade = dataValidade;
  }

  // getters/setters
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getPreco() {
    return this.preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public Data getDataValidade() {
    return this.dataValidade;
  }

  public void setDataValidade(Data dataValidade) {
    this.dataValidade = dataValidade;
  }

  // métodos
  public boolean estaVencido(Data data) {
    if (data.getAno() > this.dataValidade.getAno() ||
        (data.getAno() == this.dataValidade.getAno() && data.getMes() > this.dataValidade.getMes()) ||
        (data.getAno() == this.dataValidade.getAno() && data.getMes() == this.dataValidade.getMes()
            && data.getDia() > this.dataValidade.getDia())) {
      return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return this.nome + " (R$ " + this.preco + ", válido até " + this.dataValidade.toString() + ")";
  }

}