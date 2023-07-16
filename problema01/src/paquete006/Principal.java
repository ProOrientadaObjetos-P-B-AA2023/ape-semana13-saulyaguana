/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

import paquete003.BilleteraPagos;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        BilleteraPagos pago = new BilleteraPagos() {
            @Override
            public double calcularPago() {
                return 0;
            }
        };
        System.out.println(pago);
    }
}
