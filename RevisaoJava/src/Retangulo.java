public class Retangulo {
    double base;
    double altura;

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        ret.base = 5.0;
        ret.altura = 3.0;

        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
    }
}