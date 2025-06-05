public class Main {
    public static void main(String[] args) {
        CarroEsportivo esportivo = new CarroEsportivo("Ferrari", 1500000, 720, true);
        CarroUtilitario utilitario = new CarroUtilitario("Toyota Hilux", 280000, 1000, true);

        System.out.println("=== Carro Esportivo ===");
        esportivo.exibirInfo();

        System.out.println("\n=== Carro Utilitário ===");
        utilitario.exibirInfo();
    }
}