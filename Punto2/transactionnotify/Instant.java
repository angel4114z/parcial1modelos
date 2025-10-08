package Punto2.transactionnotify;

public class Instant implements Transaction{

    @Override
    public void notifyTransaction() {
        System.out.println(" se le notifica instantaneamente de sus transacciones");
    }
    
}
