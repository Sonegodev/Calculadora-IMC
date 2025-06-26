package driver;
import object.Usuario;
import object.Calculo;


import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("conversor de IMC");
        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();
        Calculo c = new Calculo(user);

        try {
            System.out.println("me informe seu nome completo: ");
            String respNome = sc.nextLine();
            user.setNome(respNome);
        } catch (Exception e) {
            System.out.println("informe letras.");
            sc.close();
        }

        try {
            System.out.println("me informe sua altura (m): ");
            Float respAltura = sc.nextFloat();
            sc.nextLine();
            user.setAltura(respAltura);
        } catch (Exception e) {
            System.out.println("informe com vírgula.");
        }

        try {
            System.out.println("me informe seu peso (kg): ");
            Float respPeso = sc.nextFloat();
            sc.nextLine();
            user.setPeso(respPeso);
        } catch (Exception e) {
            System.out.println("informe um inteiro ou com vírgula.");
        }

        try {
            System.out.println("me informe sua idade: ");
            Integer respIdade = sc.nextInt();
            sc.nextLine();
            user.setIdade(respIdade);
        } catch (Exception e) {
            System.out.println("informe um inteiro.");
        }

        try {
            System.out.println("quer saber seu IMC? ");
            String simNao = sc.next();
            sc.nextLine();
            switch (simNao) {
                case "sim":
                    System.out.println("seu IMC é: " + c.CalculoIMC());
                    break;

                case "não", "nao":
                    System.out.println("tenha um ótimo dia!");
                    sc.close();
                    break;
            }
        } catch (Exception e) {
            System.out.println("informe com letras.");
        }

        // reformatar if's e else's

//        System.out.println("quer saber seu IMC? ");
//        String simNao = sc.next();
//        sc.nextLine();
//
//        if (simaNao == "sim" ) {
//            System.out.println("seu IMC é: " + c.CalculoIMC());
//        }
//
//        if (simaNao == "nao" + "não") {
//            System.out.println("tenha um ótimo dia!");
//            sc.close();
//        }
//
//        if (simNao != "nao" + "não" + "sim") {
//            System.out.println("informe com letras.");
//        }

    }
}