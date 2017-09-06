/*
 * Cuadrado
 */
package calculadorageometrica;

 
public class Cuadrado implements FiguraGeometrica
{
    private double largo;
    private double ancho;
    private double areaCuadrado;
    private double perimetroCuadrado;

    public Cuadrado(double largo, double ancho) 
    {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double getLargo() 
    {
        return largo;
    }

    public void setLargo(double largo) 
    {
        this.largo = largo;
    }
    
    public double getAncho() {
        return ancho;
    }
    public void setAncho (double ancho) {
        this.ancho = ancho;
    }
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    
    public void area() 
    {
        areaCuadrado = largo * ancho;
    }
    public double getPerimetroCuadrado() {
        return perimetroCuadrado;
    }
    public void perimetro () {
        perimetroCuadrado = largo*2 + ancho*2;
    }
}
