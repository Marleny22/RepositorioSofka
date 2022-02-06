/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_objects;
import java.util.ArrayList;
import java.util.Date;

/**
 * Representa la clase Departamento, asociado a un Departamento de Colombia
 * en el que se enuncian los detalles primordiales asociados a un esquema de busqueda a nivel nacional y datos estadísticos
 * dentro de los cuales algunos pueden ser cambiantes 
 * @author Marleny Fernandez Sandoval
 */
public class Departament {
    /**
     * Representa el nombre del Departamento de Colombia.
     */
    private String name;
    /**
     * Representa la población del Departamento.
     */
    private long population;
    /**
     * Representa la lista de municipios que hacen parte del Departamento.
     */
    public ArrayList<String> municipalities;
    /**
     * Representa el nombre de la capital del Departamento.
     */
    private String capital;
    /**
     * Representa la fecha de fundación del Departamento.
     */
    public Date foundationDate;
    /**
     * Representa el clima de la región, siendo cálido, templado o frío.
     */
    public String climate;
    /**
     * Representa la superficie total del Departamento en km^2.
     */
    private int surface;
    /**
     * Representa la altitud media del Departamento en m s.n.m.
     */
    public int altitude;
    /**
     * Representa el código postal del Departamento.
     */
    private int zipCode;
    /**
     * Representa la tasa de desempleo del Departamento en porcentaje con respecto al año 2021.
     */
    protected double unemploymentRate;
    /**
     * Crea una instancia de la clase Departamento sin atributos definidos.
     */
    public Departament() {
    }
    
    /**
     * Método que permite consultar la población del departamento a la fecha actual.
     * @return Población del departamento.
     */
    public long getPopulation() {
        return this.population;
    }

    /**
     * Método que permite modificar la población del departamento a la fecha actual según el informe del DANE.
     * @param population Población del departamento.
     */
    private void setPopulation(long population) {
        this.population = population;
    }

    /**
     * Método que permite consultar la tasa de desempleo del departamento según estadísticas actuales.
     * @return Tasa de desempleo del departamento.
     */
    public double getUnemploymentRate() {
        return this.unemploymentRate;
    }

    /**
     * Método que permite actualizar la tasa de desempleo del departamento a la fecha actual.
     * @param unemploymentRate Tasa de desempleo del departamento en porcentaje.
     */
    protected void setUnemploymentRate(double unemploymentRate) {
        this.unemploymentRate = unemploymentRate;
    }

    /**
     * Método que permite consultar el nombre del Departamento.
     * @return Nombre del departamento.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método que permite consultar la capital del Departamento.
     * @return Capital del Departamento.
     */
    public String getCapital() {
        return this.capital;
    }


       
}
