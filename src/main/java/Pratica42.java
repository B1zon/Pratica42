/**
 * @author Gabriel Rodrigues Garcia <b1zon@hotmail.com>
 */

import utfpr.dainf.if62c.pratica.Circulo;
import utfpr.dainf.if62c.pratica.Elipse;


public class Pratica42 {
    public static void main(String[] args) {
        Elipse E1 = new Elipse(4.0,5.0);
        Elipse E2 = new Elipse(6.0,7.0);
        Circulo C1 = new Circulo(4.0);
        Circulo C2 = new Circulo(7.0); 
        System.out.println("Área "+E1.getNome()+"1: "+E1.getArea());
        System.out.println("Perimetro "+E1.getNome()+"1: "+E1.getPerimetro());
        System.out.println("Área "+E2.getNome()+"2: "+E2.getArea());
        System.out.println("Perimetro "+E2.getNome()+"2: "+E2.getPerimetro());
        System.out.println("Área "+C1.getNome()+"1: "+C1.getArea());
        System.out.println("Perimetro "+C1.getNome()+"1: "+C1.getPerimetro());
        System.out.println("Área "+C2.getNome()+"2: "+C2.getArea());
        System.out.println("Perimetro "+C2.getNome()+"2: "+C2.getPerimetro());
    }
}
