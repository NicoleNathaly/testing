/*
 * Circulo
 */
package calculadorageometrica;

 
public class Circulo implements FiguraGeometrica
{
    private double radio;
    private double areaCirculo;
    private double perimetroCirculo;
    static final double pi = 3.1415;

    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    public double getareaCirculo() 
    {
        return areaCirculo;
    }

   
    public void area() 
    {
        areaCirculo = pi * radio * radio;
    }
    public double getperimetroCirculo() {
        return perimetroCirculo;
    }
    public void perimetro () {
        perimetroCirculo = pi * 2 * radio;
    }
}
