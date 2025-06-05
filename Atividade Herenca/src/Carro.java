public class Carro {
    protected String marca;
    protected double preco;

    public Carro(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
    }
}
// UML https://drive.google.com/file/d/1ZrwzjwhR03Xd-OUYRSCyDIOme7qqtefk/view?usp=sharing