package Punto2.transactionnotify;

public class Weekly implements Transaction{
    @Override
    public void notifyTransaction() {
        System.out.println(" se le notifica semanalmente de sus transacciones");
    }
    
}
