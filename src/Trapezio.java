public class Trapezio extends Forma {

    private double baseMenor;
    private double baseMaior;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapezio(double baseMaior, double baseMenor, double lado1, double lado2, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    @Override
    public double area() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    @Override
    public double perimetro() {
        return baseMaior + baseMenor + lado1 + lado2;
    }
}
