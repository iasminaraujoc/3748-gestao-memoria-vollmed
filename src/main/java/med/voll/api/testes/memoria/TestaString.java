package med.voll.api.testes.memoria;

public class TestaString {
    public static void main(String[] args) {
        String valor1 = "alura";
//        String valor2 = "alura";
//        System.out.println(valor1 == valor2);
//
//        String valor3 = new String("alura");
//        System.out.println(valor1 == valor3);

        valor1 = valor1 + "Programacao";
        System.out.println(valor1);

        StringBuilder resultado = new StringBuilder();
        for(int i = 1; i<=100; i++){
            resultado.append(i).append(" ");
        }
        System.out.println(resultado);
    }
}