/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Factory;

import designpatterns.Factory.Entity.TipoDePago;

/**
 *
 * @author jgfch
 */
public class Main {

    public static void main(String[] args) throws NoSuchFieldException {
        PagoFactory pagoFactory = new PagoFactory();
        Pago pago = pagoFactory.obtenerPago(TipoDePago.GOOGLE_PAY);
        pago.crearPago();
    }
}
