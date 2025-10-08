package Punto2.offers;

public class SmsOffer implements Offer{

    @Override
    public void notifyOffer() {
        System.out.println("se le notifica por sms");
    }
    
}
