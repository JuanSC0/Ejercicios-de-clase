import java.util.*;
public class Ejemplo06{
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 double nota;
 System.out.println("Introduzca una nota entre 0 y 10: ");
 nota = sc.nextDouble();
 System.out.println("La calificacion del alumno es ");
 if(nota < 0  || nota  > 10)
 System.out.println("Nota no valida");
 else if (nota==10)
 System.out.println("Matricula de honor");
 else if (nota>=9)
 System.out.println("Sobresaliente");
 else if (nota>=8)
 System.out.println("Notable");
 else if (nota>=7)
 System.out.println("Notable");
 else
 System.out.println("Suspenso");
}
}
