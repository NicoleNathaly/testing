/*
 * Geometría
 */
package calculadorageometrica;
import java.util.*;

public class Geometria 
{
   
    public static void main(String[] args) 
    {
        String opc;
        int op;
        //Circulo:
        int radio;
        //Triangulo:
        int ladoA, ladoB, ladoC;
        //CUADRADO:
        int largo, ancho;
        Scanner sc = new Scanner (System.in);
        while (1 == 1) {
            System.out.println ("Figura geometrica\n"
                                + "1) 0 lados\n"
                                + "2) 3 lados\n"
                                + "3) 4 lados\n"
                                + "Salir) cualquier caracter no numerico");
            opc = sc.nextLine();
            try {
               op = Integer.parseInt(opc);
            }catch (NumberFormatException nfe){
                System.out.println ("Saliendo");
                break;
            }
            switch (op) {
                case 1:
                    System.out.println ("Radio---->(numero negativo sera considerado positivo y 0 sera considerado 1");
                        opc = sc.nextLine();
                    try {
                        radio = Integer.parseInt(opc);
                    }catch (NumberFormatException nfe){
                        System.out.println ("Debe ser un numero.");
                        break;
                    }
                    if (radio < 0) radio = radio *-1;
                    else if (radio == 0) radio = 1;
                    Circulo circulo = new Circulo (radio);
                    circulo.area();
                    circulo.perimetro();
                    System.out.println ("Area: " +circulo.getareaCirculo()+
                                        "\nPerimetro: " +circulo.getperimetroCirculo()+
                                        "\n");
                    break;
                case 2:
                    System.out.println ("LadoA---->(numero negativo sera considerado positivo y 0 sera considerado 1");
                        opc = sc.nextLine();
                    try {
                        ladoA = Integer.parseInt(opc);
                    }catch (NumberFormatException nfe){
                        System.out.println ("Debe ser un numero.");
                        break;
                    }
                    System.out.println ("LadoB---->(numero negativo sera considerado positivo y 0 sera considerado 1");
                        opc = sc.nextLine();
                    try {
                        ladoB = Integer.parseInt(opc);
                    }catch (NumberFormatException nfe){
                        System.out.println ("Debe ser un numero.");
                        break;
                    }
                    System.out.println ("LadoC---->(numero negativo sera considerado positivo y 0 sera considerado 1");
                        opc = sc.nextLine();
                    try {
                        ladoC = Integer.parseInt(opc);
                    }catch (NumberFormatException nfe){
                        System.out.println ("Debe ser un numero.");
                        break;
                    }
                    if (ladoA < 0) ladoA = ladoA *-1;
                        else if (ladoA == 0) ladoA = 1;
                    if (ladoB < 0) ladoB = ladoB *-1;
                        else if (ladoB == 0) ladoB = 1;
                    if (ladoC < 0) ladoC = ladoC *-1;
                        else if (ladoC == 0) ladoC = 1;
                    if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB) {
                        Triangulo triangulo = new Triangulo (ladoA, ladoB, ladoC);
                        triangulo.semiPerimetro();
                        triangulo.area();
                        triangulo.perimetro();
                        System.out.println ("Area: "+triangulo.getareaTriangulo()+
                                            "\nPerimetro: " +triangulo.getperimetroTriangulo()+
                                            "\n");
                    }
                    else {
                        System.out.println ("las medidas dadas no corresponden a un triangulo\n");
                    }
                    break;
                case 3:
                    System.out.println ("Largo---->(numero negativo sera considerado positivo y 0 sera considerado 1");
                        opc = sc.nextLine();
                    try {
                        largo = Integer.parseInt(opc);
                    }catch (NumberFormatException nfe){
                        System.out.println ("Debe ser un numero.");
                        break;
                    }
                    System.out.println ("Ancho---->(numero negativo sera considerado positivo y 0 sera considerado 1");
                        opc = sc.nextLine();
                    try {
                        ancho = Integer.parseInt(opc);
                    }catch (NumberFormatException nfe){
                        System.out.println ("Debe ser un numero.");
                        break;
                    }
                    Cuadrado cuadrado = new Cuadrado (largo, ancho);
                        cuadrado.area();
                        cuadrado.perimetro();
                    System.out.println("Area: " +cuadrado.getareaCuadrado()+
                                        "\nPerimetro: " +cuadrado.getPerimetroCuadrado()+
                                        "\n");
                    break;
                default:
                    break;
            }
            
        }     
    }    
}
