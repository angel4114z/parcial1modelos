package Punto2.offers;

public class EmailOffer implements Offer{

    @Override
    public void notifyOffer() {
        System.out.println("se le notifica por email");
    }
    
}
