package uvg.edu.gt;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;
public class InterpretePrincipal {
    public static  void main(String[] args){

        //Instancia necesarias para que funcione el main
        Calculadora2 esperanza = new Calculadora2();

        Vector <String> varios = new Vector<String>();


        Scanner scan = new Scanner(System.in);

        String instruccion ="";
        System.out.println("----------Interpretador de LISP ------" );
        System.out.println();


          //Luego de leer el txt e imprimir los resultados, se da paso al inicio del interprete
          //dando opcion al usuario que ingrese instrucciones LISP
          //para finaliar el programa el usuario puede escribir la instruccion (exit)


        boolean interprete = true;
        int numero = 0;
        while(interprete ==  true){
            numero++;
            System.out.println("Ingresa instrucciones LISP");
            System.out.print(" CL-USER "+numero+" > ");
            instruccion = scan.nextLine();
            if (instruccion.equals("( exit )")||instruccion.equals("(exit)")) {
                interprete = false;
            }else{
                try{
                    System.out.println(" "+esperanza.Calculo(instruccion));
                    System.out.println();
                }catch(Exception e){
                    System.out.println(" Error");
                    System.out.println();
                }

            }


        }
    }

}
