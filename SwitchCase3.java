package SwitchCase;

import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args) {
        String acao;
        Scanner acaoScanner = new Scanner(System.in);
        int vent = 0;

        do{
            System.out.println("Deseja ligar ou desligar o ventilador?");
            System.out.println("digite parar se quiser parar o programa.");
            acao = acaoScanner.nextLine();

            switch (acao) {
                case "ligar":
                    if (vent==0){
                        System.out.println("Ligando o ventilador.");
                        vent=1;
                        System.out.println("~");
                    }else{
                        System.out.println("Ventilador já estava ligado.");
                        System.out.println("~");
                    }
                    break;
                case "desligar":
                    if (vent==0){
                        System.out.println("Ventilador já estava desligado.");
                        System.out.println("~");
                    }else{
                        System.out.println("Desligando o ventilador.");
                        System.out.println("~");
                        vent = 0;
                    }
                    break;
            
                default:
                    System.out.println("Interrompendo programa.");
                    vent=2;
                    break;
            }
        }while(vent<2);
        
        acaoScanner.close();
    }
}
