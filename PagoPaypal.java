/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Factory;

/**
 *
 * @author jgfch
 */
public class PagoPaypal implements Pago{

    @Override
    public void crearPago() {
        System.out.println("Pago con Paypal");
    }
    
}
