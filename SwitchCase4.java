package SwitchCase;

import java.util.Scanner;

public class SwitchCase4 {
    public static void main(String[] args) {
        Scanner idadScanner = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        int idade = idadScanner.nextInt();
        String maioridade;

        if (idade<12){
            maioridade = "menor";
        }else if(idade<=14){
            maioridade = "pre";
        }else if(idade<=16){
            maioridade = "adole";
        }else{
            maioridade = "adulto";
        }

        switch (maioridade) {
            case "menor":
                System.out.println("Recomendado que vá assistir Trolls 3 ou Patrulha Canina.");
                break;
            case "pre":
                System.out.println("Recomendado que vá assistir Nosso Sonho ou As Marvels.");
                break;
            case "adole":
                System.out.println("Recomendado que vá assistir Assassinos da Lua das Flores ou Five Nights at Freddys.");
                break;
            case "adulto":
                System.out.println("Recomendado que vá assistir Jogo da Invocação ou Napoleão.");
                break;
        }
        idadScanner.close();

    }
}