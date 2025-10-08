package Punto2.currencyalert;

public class Umbral implements CurrencyAlert{

    @Override
    public void alert() {
        System.out.println("Alerta! su saldo esta debajo del umbral");
    }
    
}
