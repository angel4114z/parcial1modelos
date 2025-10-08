package Punto2.bank;

import Punto2.currencyalert.CurrencyAlert;
import Punto2.offers.Offer;
import Punto2.transactionnotify.Transaction;

public class Movii implements Bank{
    public Movii(CurrencyAlert currencyAlert, Offer offer, Transaction transaction){
        this.currencyAlert = currencyAlert;
        this.offer = offer;
        this.transaction = transaction;
    }

    @Override
    public void notifyl(){
        currencyAlert.alert();
        offer.notifyOffer();
        transaction.notifyTransaction();
    }
}
