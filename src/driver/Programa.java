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
            System.exit(0);
        }

        try {
            System.out.println("me informe sua altura (m): ");
            Float respAltura = sc.nextFloat();
            sc.nextLine();

            if (respAltura > 3) {
                respAltura = respAltura / 100;
            }

            user.setAltura(respAltura);

        } catch (Exception e) {
            System.out.println("informe números.");
            sc.close();
            System.exit(0);
        }

        try {
            System.out.println("me informe seu peso (kg): ");
            Float respPeso = sc.nextFloat();
            sc.nextLine();
            user.setPeso(respPeso);
        } catch (Exception e) {
            System.out.println("informe números.");
            sc.close();
            System.exit(0);
        }

        try {
            System.out.println("me informe sua idade: ");
            Integer respIdade = sc.nextInt();
            sc.nextLine();
            user.setIdade(respIdade);
        } catch (Exception e) {
            System.out.println("informe números.");
            sc.close();
            System.exit(0);
        }

        System.out.println("deseja saber seu IMC? (s/n)");
        String opcao = sc.nextLine();

        if (opcao.equals("s")) {
            System.out.println("ótimo! seu IMC é: " + c.CalculoIMC());
        } else {
            System.out.println("obrigado!");
            sc.close();
            System.exit(0);
        }

    }
}