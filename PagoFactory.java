/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Factory;

import designpatterns.Factory.Entity.TipoDePago;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jgfch
 */
public class PagoFactory {
    /*
    private final static Map<TipoDePago, Pago> pagos = new HashMap<>(){
        {
            put(TipoDePago.PAYPAL, new PagoPaypal());
            put(TipoDePago.GOOGLE_PAY, new PagoGooglePay());
            put(TipoDePago.TARJETA_CREDITO, new PagoTarjetaCredito());
            put(TipoDePago.TARJETA_DEBITO, new PagoTarjetaDebito());
        }
    };*/

    public Pago obtenerPago(TipoDePago tp) throws NoSuchFieldException {
        //return pagos.get(tp);
        return switch (tp) {
            case PAYPAL -> new PagoPaypal();
            case GOOGLE_PAY -> new PagoGooglePay();
            case TARJETA_CREDITO -> new PagoTarjetaCredito();
            case TARJETA_DEBITO -> new PagoTarjetaDebito();
            default ->
                throw new NoSuchFieldException("Tipo de Pago No encontrado");
        };
    }
}
