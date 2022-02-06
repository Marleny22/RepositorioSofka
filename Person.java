
package example_objects;

import java.util.Date;

/**
 * Representa la clase Persona con algunas de las características que la definen. 
 * @author Marleny Fernández Sandoval
 */
public class Person {
    /**
     * Representa la característica Nombre.
     */
    public String name;
    /**
     * Representa la característica apellido paterno.
     */
    private String lastName1;
    /**
     * Representa la característica apellido materno.
     */
    private String lstName2;
    /**
     * Representa la característica identificación.
     */
    public double ID;
    /**
     * Representa la característica sexo, siendo femenino o masculino.
     */
    private String sex;
    /**
     * Representa la característica estado civil, siendo soltero, casado o divorciado.
     */
    private String civilStatus;
    /**
     * Representa la característica fecha de nacimiento.
     */
    public Date dateBirth;
    /**
     * Representa la característica altura, que se mide en metros.
     */
    public float height;

    /**
     * Crea una instancia de la clase Persona.
     */
    public Person() {
    }
    
    /**
     * Crea una instancia de la clase Persona con unos atributos especificados.
     * @param name Atributo nombre.
     * @param lastName1 Atributo apellido paterno.
     * @param lstName2 Atributo apellido materno.
     * @param ID Atributo identificación.
     * @param sex Atributo sexo.
     * @param dateBirth Atributo fecha de nacimiento.
     * @param height Atributo altura.
     */

    public Person(String name, String lastName1, String lstName2, double ID, String sex, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lstName2 = lstName2;
        this.ID = ID;
        this.sex = sex;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    
    /**
     * Método para obtener el nombre de la Persona.
     * @return nombre de la persona.
     */

    public String getName() {
        System.out.println("El nombre de la persona es : "+this.name);
        return this.name;
    }
    /**
     * Método para asignar un nombre a la instancia creada.
     * @param name Nombre de la Persona.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Método para obtener el primer apellido de la persona.
     * @return Apellido paterno.
     */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * Método para asignar el primer apellido a la instancia creada.
     * @param lastName1 Apellido paterno
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Método para obtener el segundo apellido de la persona.
     * @return Apellido materno
     */
    public String getLstName2() {
        return lstName2;
    }
    /**
     * Método para asignar el segundo apellido a la instancia creada.
     * @param lstName2 Apellido materno
     */
    public void setLstName2(String lstName2) {
        this.lstName2 = lstName2;
    }
    
    


    
}
