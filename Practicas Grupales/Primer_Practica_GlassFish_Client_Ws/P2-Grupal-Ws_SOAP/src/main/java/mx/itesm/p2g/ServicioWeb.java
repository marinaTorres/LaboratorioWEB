/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itesm.p2g;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marina
 */
@WebService(serviceName="ServicioWeb")

public class ServicioWeb {
    @WebMethod(operationName="saludo")
    public String saludo(@WebParam(name = "nombre") String nombre) throws ServicioWebException{
         if(nombre == null || nombre.trim().isEmpty()){
             throw new ServicioWebException("Debe especificar un nombre.");
         }
         return "¡Saludos " + nombre + "!";
    }
    
    @WebMethod(operationName="operacion")
    public int operacion(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) throws ServicioWebException{
         if(num2 == 0){
             throw new ServicioWebException("No se puede dividie entre cero!!!");
         }
         return num1/num2;
    } 
    
}
