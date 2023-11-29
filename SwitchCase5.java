package SwitchCase;

public class SwitchCase5 {
    public static void main(String[] args) throws InterruptedException {
        int cont = 0;

        do{
            Thread.sleep(1000);
            cont=cont+1;

            switch (cont) {
                case 20:
                    System.out.println("Já são 20h, abrindo portão.");
                    break;
            
                default:
                    System.out.println("São "+cont+ " horas, portão trancado.");
                    break;
            }
        }while(cont<20);
    }
}
