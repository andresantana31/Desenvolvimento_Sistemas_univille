class CarroEsportivo extends Carro {
    private int potencia;
    private boolean possuiTurbo;

    public CarroEsportivo(String marca, double preco, int potencia, boolean possuiTurbo) {
        super(marca, preco);
        this.potencia = potencia;
        this.possuiTurbo = possuiTurbo;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Potência: " + potencia + " CV");
        System.out.println("Possui turbo: " + (possuiTurbo ? "Sim" : "Não"));
    }
}