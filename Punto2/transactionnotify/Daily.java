package Punto2.transactionnotify;

public class Daily implements Transaction{
    @Override
    public void notifyTransaction() {
        System.out.println(" se le notifica diariamente de sus transacciones");
    }
}
