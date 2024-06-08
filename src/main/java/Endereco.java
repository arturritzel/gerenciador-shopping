public class Endereco {

  // atributos padrão
  private String nomeDaRua;
  private String cidade;
  private String estado;
  private String pais;
  private String cep;
  private String numero;
  private String complemento;

  // construtores
  public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero,
      String complemento) {
    this.nomeDaRua = nomeDaRua;
    this.cidade = cidade;
    this.estado = estado;
    this.pais = pais;
    this.cep = cep;
    this.numero = numero;
    this.complemento = complemento;
  }

  // getters/setters
  public String getNomeDaRua() {
    return this.nomeDaRua;
  }

  public void setNomeDaRua(String nomeDaRua) {
    this.nomeDaRua = nomeDaRua;
  }

  public String getCidade() {
    return this.cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return this.estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getPais() {
    return this.pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public String getCep() {
    return this.cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return this.complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  // métodos

  @Override
  public String toString() {
    return this.nomeDaRua + ", n. " + this.numero + " (" + this.complemento + "), " + this.cidade + ", " + this.estado
        + ", " + this.pais + ", CEP: " + this.cep;
  }

}