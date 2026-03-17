package metodos;

public class Roupas {
    private String nome;
    private int quantidade;
    private double valor;

    public Roupas(String nome, int Quantidade, double Valor) {
        this.nome = nome;
        this.quantidade = Quantidade;
        this.valor = Valor;
    }
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
    public int getQuantidade() {
        return quantidade;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double Valor) {
        this.valor = Valor;

    }
    public void setQuantidade(int Quantidade) {
        this.quantidade = Quantidade;
    }

    // calculo
    public double calcularTotal() {
       return this.quantidade * this.valor;
    }





    @Override
    public String toString() {
        return "Roupas{" +
                "\nnome: " + nome +
                ",\nQuantidade: " + quantidade +
                ",\nValor: " + valor +
                '}';
    }
}
