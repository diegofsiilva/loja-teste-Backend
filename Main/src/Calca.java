public class Calca implements Produto{

    @Override
    public void codigo() {
        System.out.println("CAL-002");
    }

    @Override
    public void descricao() {
        System.out.println("Camisa média");
    }

    @Override
    public void tamanho() {
        System.out.println("Tamanho 46");
    }

    @Override
    public void cor() {
        System.out.println("Preta");
    }

    @Override
    public void preco() {
        System.out.println(129.9);
    }

    @Override
    public void repor(int repor) {

    }

    @Override
    public void estoque(int estoque, int reposto, int estoqueInicial) {
        estoque=100;
    }

    @Override
    public void vender(int vender) {

    }
}
