package ejemplocalculadora;

public class Main {

    public static void main(String[] args) {
        int x=8;
        int y=3;
        System.out.println("la suma de "+x+" y "+y+" es igual a "+Suma.suma(x, y));
        System.out.println("la resta de "+x+" y "+y+" es igual a "+Resta.resta(x, y));
        multiplicacion multiplicacion = new multiplicacion();
        System.out.println("la multipicacion de "+x+" y "+y+" es igual a "+multiplicacion.multiplicar(x, y));
        Division division = new Division();
        System.out.println("la division de "+x+" y "+y+" es igual a "+division.division(x, y) +" y su residuo es "+division.residuo(x, y) );
        
        
    }

}
