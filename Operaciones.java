
import Datos.Valores;
import Proceso.Suma;
import Proceso.Resta;
import Proceso.Multiplicacion;
import Proceso.Division;

public class Operaciones {
    
    public static void main(String[] args) {
        
    Valores  valores = new Valores();
    Suma sumamos = new Suma();
    sumamos.operacionSumar(valores.num1, valores.num2);

    Resta restamos = new Resta();
    restamos.operacionRestar(valores.num4, valores.num2);

    Multiplicacion multiplicamos = new Multiplicacion();
    multiplicamos.operacionMultiplicar(valores.num2, valores.num3);

    Division dividimos = new Division();
    dividimos.operacionDividir(valores.num4, valores.num3);
    int a = valores.num4;
    int b = valores.num3;



    System.out.println("Dentro del main La División entre " +  a  + " y " +  b  + " es: " + a/b);
    System.out.println(a/b);


    }
}
