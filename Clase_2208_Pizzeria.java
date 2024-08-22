/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clduocvina.clase_2208_pizzeria;

/**
 *
 * @author vina
 */
public class Clase_2208_Pizzeria {
    public void crearOrden(Cocinero cocinero, Pizza pizza) {
        cocinero.preparar(pizza);
        
    }

    public static void main(String[] args) {
        
        Clase_2208_Pizzeria pizzeria = new Clase_2208_Pizzeria();
        
        Cocinero cocinero_tarde = new Cocinero();
        Pizza pizza_unica = new Pizza();
        
        pizzeria.crearOrden(cocinero_tarde, pizza_unica);
        
        
    }
}
