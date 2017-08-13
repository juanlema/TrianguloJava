/**
 * Autor Juan León
 */
//los tres lados del triangulo los voy a llamar borde
public class TrianguloJava{
    double borde1;
    double borde2;
    double borde3;
    double perimetro;
    double area;

        public TrianguloJava (double primer, double segundo, double tercer)
    {
        borde1=primer;
        borde2=segundo;
        borde3=tercer;
        perimetro();
        area();
    }

       public double area()
    {
        double PrimeraOper = (borde1 + borde2 + borde3)*(1)/(2);
        double SegundaOper =Math.sqrt(PrimeraOper*(PrimeraOper-borde1)*(PrimeraOper-borde2)*(PrimeraOper-borde3));
        area = SegundaOper;
        return area;
    }
        public double perimetro()
    {
        perimetro = borde1 + borde2 + borde3;
        return perimetro;
    }

    
   
}
