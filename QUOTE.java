package uvg.edu.gt;


import java.util.*; //Importando todas las clases por si acaso.


public class QUOTE {

    //Método QUOTE: Imprimiendo el contenido de datos.text.

    public static String quote(String imp){

        String str1 = "";

        for (int i = 0; i < imp.length(); i++){
            if(String.valueOf(imp.charAt(i)).equals(")")||String.valueOf(imp.charAt(i)).equals("(")){

            }else{
                str1 = str1 + imp.charAt(i);
            }
        }

        //Dando split de espacio vacío a la expresión.

        String[] str2 = str1.split(" "); //Dando espacios vacíos entre cada elemento que se agrega al Array.

        ArrayList<String> stq = new ArrayList<String>();  //ArrayList para los datos que se van a stqertir.

        //Agregando de manera normal los valores del archivo Prueba.txt.
        for (int n = 1; n <str2.length; n++) {

            stq.add(String.valueOf(str2[n])); //Añadiendo los elementos a invertir en el ArrayList.
        }

        String c = "";

        for(int i = 0; i < stq.size(); i++){
            c = c + stq.get(i) + " ";
        }

        c = "(" + c + ")";

        return c; //return del contenido.
    }
}
