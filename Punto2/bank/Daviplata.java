package Punto2.bank;

import Punto2.currencyalert.*;
import Punto2.offers.*;
import Punto2.transactionnotify.*;

public class Daviplata implements Bank{

    public Daviplata(CurrencyAlert currencyAlert, Offer offer, Transaction transaction){
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
