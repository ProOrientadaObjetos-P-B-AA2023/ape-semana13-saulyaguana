/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;

abstract public class TipoMatricula {
    private double tarifa;

    public Matricula() {
    }

    public Matricula(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public abstract void calcularTarifa();

    @Override
    public String toString() {
        return "Matricula{" + "tarifa=" + tarifa + '}';
    }
    
    
}
