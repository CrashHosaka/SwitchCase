package SwitchCase;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        String acao;
        Scanner acaoScanner = new Scanner(System.in);
        int lamp = 0;

        do{
            System.out.println("Deseja ligar ou desligar a lâmpada?");
            System.out.println("digite parar se quiser parar o programa.");
            acao = acaoScanner.nextLine();

            switch (acao) {
                case "ligar":
                    if (lamp==0){
                        System.out.println("Ligando a lâmpada.");
                        lamp=1;
                        System.out.println("~");
                    }else{
                        System.out.println("Lâmpada já estava ligada.");
                        System.out.println("~");
                    }
                    break;
                case "desligar":
                    if (lamp==0){
                        System.out.println("Lâmpada já estava desligada.");
                        System.out.println("~");
                    }else{
                        System.out.println("Desligando a lâmpada.");
                        System.out.println("~");
                        lamp = 0;
                    }
                    break;
            
                default:
                    System.out.println("Interrompendo programa.");
                    lamp=2;
                    break;
            }
        }while(lamp<2);
        
        acaoScanner.close();
    }
}
