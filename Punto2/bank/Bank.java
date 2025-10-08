package Punto2.bank;

import Punto2.currencyalert.*;
import Punto2.offers.*;
import Punto2.transactionnotify.*;

public interface Bank {

    CurrencyAlert currencyAlert;
    Offer offer;
    Transaction transaction;
    
    public void notifyl();

}
