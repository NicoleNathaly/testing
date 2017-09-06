/*
 * Triangulo
 */
package calculadorageometrica;

public class Triangulo implements FiguraGeometrica
{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double sp;
    private double areaTriangulo;
    private double perimetroTriangulo;
    

    public Triangulo(double ladoA, double ladoB, double ladoC) 
    {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    public void setladoA(double ladoA)
    {
        this.ladoA = ladoA;
    }
    
    public double getladoA() 
    {
        return ladoA;
    }

    public void setladoB(double ladoB)
    {
        this.ladoB = ladoB;
    }
    public double getladoB() 
    {
        return ladoB;
    }

    public void setladoC (double ladoC)
    {
        this.ladoC = ladoC;
    }
    
    public double getladoC() 
    {
        return ladoC;
    }
    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    
    public void area() 
    {
        areaTriangulo = Math.sqrt(sp *(sp - ladoA) * (sp - ladoB) * (sp - ladoC));
    }
    public double getperimetroTriangulo () {
        return perimetroTriangulo;
    }
    public void perimetro () {
        perimetroTriangulo = ladoA + ladoB + ladoC;
    }
    public void semiPerimetro () {
        sp = (ladoA + ladoB + ladoC)/2; 
    }
    
}
