
public class Matematico
{
    private Calculadora calculadora;
    private Punto punto;
    
    public Matematico(Calculadora calculadora){
        this.calculadora = calculadora;
    }
    
    public Dupla decirResEcuacionDeSegundoGrado(double num1,double num2, double num3){
        return calculadora.calcularEcuacionSegundoGrado(num1,num2,num3);
    }
    
    public Dupla2 decirEcuacionDeRecta(Punto punto1,Punto punto2){
        return calculadora.calcularEcuacionRecta(punto1,punto2);
    }
    
    public double decirElCatetoFaltante(double hipotenusa, double cateto1){
        return calculadora.calcularCatetoFaltante(hipotenusa,cateto1);
    }
    
}
