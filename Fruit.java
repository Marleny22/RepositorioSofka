
package example_objects;

import java.util.ArrayList;

/**
 * Representa la clase Fruta y sus adjetivos descriptivos que las diferencian
 * @author Marleny Fernandez Sandoval
 */
public class Fruit {
    /**
     * Representa el nombre de la fruta.
     */
    public  String name;
    /**
     * Representa el peso de la fruta.
     */
    private float averageWeight;
    /**
     * Representa la lista de los posibles colores que puede tener la fruta.
     */
    public ArrayList<String> colors = new ArrayList(); 
    /**
     * Representa el nombre del color que puede tener la fruta.
     */
    protected String colorName;
    /**
     * Crea una instancia de la clase Fruta sin atributos definidos.
     */
    public Fruit() {
         
    }
    /**
     * Crea una instancia de la clase Fruta con atributos definidos.
     * @param name Nombre de la fruta.
     * @param averageWeight Peso de la fruta.
     * @param colors Colores de la fruta.
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    /**
     * Método para asignar un nombre a la instancia creada.
     * @param name Nombre de la fruta.
     */

    public void setName(String name) {
        this.name = name;
    }
    /**
     * Método para obtener el nombre de la instancia creada.
     * @return Nombre de la fruta.
     */
     public String getName() {
        return name;
    }
    
    /**
     * Método para obtener el atributo colores de la instancia creada.
     * @return Lista de colores de la fruta.
     */
    public ArrayList<String> getColors() {
        System.out.println("Los  colores de la fruta " + this.name+" son: "+ this.colors);
        return this.colors;
    }

    /**
     * Método para asignar una lista los posibles colores de la fruta.
     * @param colors Lista de colores de la fruta.
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    /**
     * Método para asignar de forma independiente los elementos de la lista de los colores de la fruta.
     * @param colorName Nombre del color de la fruta.
     */
     public void setColor(String colorName) {
        colors.add(colorName);
        this.colors = colors;
    }
    
    
}
