public interface Produto {
    void codigo(int codigo);
    void descricao(String descricao);
    void tamanho(String tamanho);
    void cor(String cor);
    void preco(Double preco);
    void estoque(int estoque, int reposto, int estoqueInicial);
}
