package pe.edu.vallegrande.calculadora;

public class Calculadora {

    public int sumar(int a, int b) {
        System.out.println("Metodo sumar()");
        int resultado = a + b;
        System.out.println("Resultado de sumar: " + resultado);
        return resultado;
    }

    public int restar(int a, int b) {
        System.out.println("Metodo restar()");
        int resultado = a - b;
        System.out.println("Resultado de restar: " + resultado);
        return resultado;
    }

    public int multiplicar(int a, int b) {
        System.out.println("Metodo multiplicar()");
        int resultado = a * b;
        System.out.println("Resultado de multiplicar: " + resultado);
        return resultado;
    }

    public int dividir(int a, int b) {
        System.out.println("Metodo dividir()");
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        int resultado = a / b;
        System.out.println("Resultado de dividir: " + resultado);
        return resultado;
    }

    public double porcentaje(int parte, int total) {
        System.out.println("Metodo porcentaje()");
        if (total == 0) {
            throw new ArithmeticException("No se puede calcular porcentaje con total = 0");
        }
        double resultado = (parte * 100.0) / total;
        System.out.println("Resultado del porcentaje: " + resultado + "%");
        return resultado;
    }

    public double raizCuadrada(double x) {
        System.out.println("Metodo raizCuadrada()");
        if (x < 0) {
            throw new IllegalArgumentException("No se puede calcular la raiz cuadrada de un numero negativo");
        }
        double resultado = Math.sqrt(x);
        System.out.println("Resultado de raiz cuadrada: " + resultado);
        return resultado;
    }
}
