package javaTreino;

public class MinhaClasse {
    public static void main (String [] args ) {
        String BR = "Brasil";
        //double PI = 3.14; Declaração de variavéis que não irão se alterar, utilizando letras maiúsculas
        //int ESTADOS_BRASILEIROS = 27; Declarar a palavra reservada "final" antes da variavél
        //final int ANO_2000 = 2000;
        System.out.println(BR);
        String primeiroNome = "Jeiel";
        String segundoNome = "Lucas";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        /*String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto(primeiroNome, segundoNome);*/
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
       }
}
