public class Camiseta implements Produto {

    @Override
    public void codigo(int codigo) {
        codigo=4189283;
        System.out.println(codigo);
        return codigo();

    }
    @Override
    public void descricao(String descricao) {
        descricao="SIUU";
        System.out.println(descricao);

    }
    @Override
    public void tamanho(String tamanho) {
        tamanho="M";
        System.out.println(tamanho);

    }
    @Override
    public void cor(String cor) {
        cor="Cinza";
        System.out.println(cor);
    }
    @Override
    public void preco(Double preco) {
        preco=129.90;
        System.out.println(preco);
    }
    @Override
    public void estoque(int vendido, int reposto,int estoqueInicial) {
        System.out.println(" foi vendido " + vendido);
        System.out.println(" foi rep " + reposto);
        System.out.println(" tem " + (estoqueInicial-vendido+reposto));

    }

}
