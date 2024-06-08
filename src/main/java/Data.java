public class Data {

  // atributos padrão
  private int dia;
  private int mes;
  private int ano;

  // construtores
  public Data(int dia, int mes, int ano) {
    this.ano = ano;

    if (diaDoMesValido(dia, mes)) { // caso a data seja valida
      this.dia = dia;
      this.mes = mes;
    }

    else
      resetaData();
  }

  // getters/setters
  /// quando o dia for inválido, deveria resetar a data ou não modificar? optei
  // por apenas não modificar
  public int getDia() {
    return this.dia;
  }

  public void setDia(int dia) {
    if (diaDoMesValido(dia, this.mes))
      this.dia = dia;
  }

  public int getMes() {
    return this.mes;
  }

  public void setMes(int mes) {
    if (diaDoMesValido(this.dia, mes))
      this.mes = mes;
  }

  public int getAno() {
    return this.ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  // métodos
  public boolean verificaAnoBissexto() {
    if ((this.ano % 4 == 0) && (this.ano % 100 != 0 || this.ano % 400 == 0)) {
      return true; // é bissexto
    } else {
      return false; // não é bissexto
    }
  }

  private boolean diaDoMesValido(int dia, int mes) {
    if (dia < 1 || dia > 31)
      return false; // dia impossivel
    if (mes < 1 || mes > 12)
      return false; // mes impossivel

    if (dia == 31 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11))
      return false; // dia 31 em meses de até 30 dias
    if (dia == 30 && mes == 2)
      return false; // dia 30 em fevereiro

    if (dia == 29 && mes == 2 && !verificaAnoBissexto())
      return false; // 29/02 so e possivel em anos bissextos

    return true;
  }

  private void resetaData() { // reseta a data para o dia 1 do mes 1 do ano 1
    this.dia = 1;
    this.mes = 1;
    this.ano = 2000;
  }

  @Override
  public String toString() {
    String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro" };
    return this.dia + " de " + meses[this.mes - 1] + " de " + this.ano;
  }

}