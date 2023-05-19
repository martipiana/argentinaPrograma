/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_poo;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author Martina
 */
public class Ej_fecha {

    
    public static void main(String[] args) {
       FechaService serv = new FechaService();
       Date cumple = serv.fechaNacimiento();
       Date hoy = serv.fechaActual();
       serv.diferencia(cumple, hoy);
    }
    
}
