/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itesm.p2g.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.itesm.p2g.client.ServicioWeb;
import mx.itesm.p2g.client.ServicioWebException_Exception;
import mx.itesm.p2g.client.ServicioWeb_Service;

/**
 *
 * @author Marina
 */
public class Test {
     public static void main(String[] args){
         ServicioWeb_Service service = new ServicioWeb_Service();
         ServicioWeb servicioWeb = service.getServicioWebPort();
         
         try{
             String respuesta = servicioWeb.saludo("Jorge");
             Logger.getLogger(Test.class.getName()).log(Level.INFO, respuesta);
         }catch (ServicioWebException_Exception ex){
             Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         try{
             int resultado = servicioWeb.operacion(4,0);
             Logger.getLogger(Test.class.getName()).log(Level.INFO, Integer.toString(resultado));
         }catch(ServicioWebException_Exception ex){
             Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
         }
     } 
}