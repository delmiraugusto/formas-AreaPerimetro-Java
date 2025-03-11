import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

        private Scanner scanner;
        private List<Forma> formas;

        public Menu() {
            scanner = new Scanner(System.in);
            formas = new ArrayList<>();
        }

        private int obterOpcao() {
            System.out.println("\n1. Incluir dados de um retângulo");
            System.out.println("2. Incluir dados de um triângulo");
            System.out.println("3. Incluir dados de um trapézio");
            System.out.println("4. Incluir dados de um círculo.");
            System.out.println("5. Listar áreas e perímetros das figuras.");
            System.out.println("0. Sair");
            System.out.print("Digite a opção: ");
            return scanner.nextInt();
        }

        private void incluirCirculo() {
            System.out.print("\nDigite o raio do circulo: ");
            double raio = scanner.nextDouble();
            Circulo circulo = new Circulo(raio);
            formas.add(circulo);
        }

        private void incluirTrapezio() {
            System.out.print("\nDigite a base maior do trapezio: ");
            double baseMaior = scanner.nextDouble();
            System.out.print("Digite a base menor do trapezio: ");
            double baseMenor = scanner.nextDouble();
            System.out.print("Digite um lado do trapezio : ");
            double lado1 = scanner.nextDouble();
            System.out.print("Digite o outro lado B do trapezio : ");
            double lado2 = scanner.nextDouble();
            System.out.print("Digite a altura do trapezio : ");
            double altura = scanner.nextDouble();

            Trapezio trapezio = new Trapezio(baseMaior, baseMenor, lado1, lado2, altura);
            formas.add(trapezio);
        }

        private void incluirTriangulo() {
            System.out.print("\nDigite o lado A do triangulo : ");
            double a = scanner.nextDouble();
            System.out.print("Digite o lado B do triangulo : ");
            double b = scanner.nextDouble();
            System.out.print("Digite o lado C do triangulo : ");
            double c = scanner.nextDouble();

            Triangulo triangulo = new Triangulo(a, b, c);
            formas.add(triangulo);
        }

        private void incluirRetangulo() {
            System.out.print("\nDigite a largura do retangulo : ");
            double largura = scanner.nextDouble();
            System.out.print("Digite a altura do retangulo : ");
            double altura = scanner.nextDouble();

            Retangulo retangulo = new Retangulo(largura, altura);
            formas.add(retangulo);
        }

        private void listar() {
            if(!formas.isEmpty()) {
                for (Forma forma : formas) {
                    System.out.println("\nTipo: " + forma.getClass().getSimpleName());
                    System.out.printf("Área: %.2f\n", forma.area());
                    System.out.printf("Perímetro: %.2f\n", forma.perimetro());
                    System.out.println("-------------------------------------");
                }
            }else {
                System.out.println("Nenhuma forma encontrada");
            }
        }

        public void executar() {
            int opcao = 0;
            do {
                opcao = obterOpcao();
                switch (opcao) {
                    case 1:
                        incluirRetangulo();
                        break;
                    case 2:
                        incluirTriangulo();
                        break;
                    case 3:
                        incluirTrapezio();
                        break;
                    case 4:
                        incluirCirculo();
                        break;
                    case 5:
                        listar();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        try{
                            Thread.sleep(2000);
                        }
                        catch(InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        System.out.println("Opção incorreta.");
                }
            } while (opcao != 0);
        }
    }