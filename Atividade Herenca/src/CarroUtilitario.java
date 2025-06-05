class CarroUtilitario extends Carro {
    private double capacidadeCarga;
    private boolean tracao4x4;

    public CarroUtilitario(String marca, double preco, double capacidadeCarga, boolean tracao4x4) {
        super(marca, preco);
        this.capacidadeCarga = capacidadeCarga;
        this.tracao4x4 = tracao4x4;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " kg");
        System.out.println("Tração 4x4: " + (tracao4x4 ? "Sim" : "Não"));
    }
}