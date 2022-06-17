package br.org.python.ListaDeExercicios.EstruturaDeDecisao;


import java.util.*;

/* Exercício 4
* Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
* Foi modificado para retorna o alfabeto classficando cada letra em vogal e consoante
*/
public class Ex4_Verifica_Vogal_Consoante {

    public static Collection<String> alfabeto() {

        String alfabeto = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String[] arr = alfabeto.split(",");

        Collection<String> collection = new HashSet<>();

        Collections.addAll(collection, arr);

         return collection;
    }

    public static String vogal_ou_consoante(String letra) {

        letra = letra.toLowerCase();

        List<String> vogais = Arrays.asList("a", "e", "i", "o", "u", "y");

        if (!alfabeto().contains(letra))
            return letra + " - Consoante";
        if (!vogais.contains(letra))
            return letra + " - Consoante";

        return letra + " - Vogal";
    }

    public static void main(String[] args) {

        alfabeto().forEach(letra -> System.out.println(vogal_ou_consoante(letra)));
    }
}
