package Clases_y_Objetos;

public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;
    
    //Metodos
    
    //Metodo Constructor 1 (CUADRILATERO)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Meotodo Constructor 2 (CUADRADO)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    
    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }
    
    
    

    
    
}
