/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_objects;

/**
 * Representa la clase Libro asociado a un esquema de venta de libros, donde se enuncian sus características 
 * @author Marleny Fernandez Sandoval
 */
public class Book {
    /**
     * Representa el título del libro.
     */
    private String title;
    /**
     * Representa el autor del libro.
     */
    private String author;
    /**
     * Representa el precio del libro en pesos Colombianos.
     */
    public double price;
    /**
     * Representa el código normalizado internacional para libros, una identificación única.
     */
    private String ISBN;
    /**
     * Representa el número de páginas del libro.
     */
    private int numPages;
    /**
     * Representa el editorial del libro.
     */
    private String publisher;
    /**
     * Representa el año de publicación del libro.
     */
    private int year;
    
    /**
     * Crea una instancia de la clase Libro sin atributos definidos.
     */
    public Book() {
    }
    /**
     * Crea una instancia de la clase Libro con atributos definidos.
     * @param title Título del libro.
     * @param author Autor del libro.
     * @param price Precio del libro en pesos Colombianos.
     * @param ISBN ISBN del libro.
     * @param numPages Número de páginas del libro.
     * @param publisher Editorial del libro.
     * @param year Año de publicación del libro.
     */
    public Book(String title, String author, double price, String ISBN, int numPages, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
        this.numPages = numPages;
        this.publisher = publisher;
        this.year = year;
    }

    /**
     * Método para obtener el precio actual del libro.
     * @return Precio del libro en pesos Colombianos
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Método para asignar un precio al libro creado como una instancia de la clase Libro.
     * @param price Precio del libro en pesos Colombianos.
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Método para consultar el Título del libro.
     * @return Titulo del libro.
     */
    public String getTitle() {
        return title;
    }
    
     /**
     * Método para consultar el Autor del libro.
     * @return Autor del libro.
     */
    public String getAuthor() {
        return this.author;
    }

     /**
     * Método para consultar el año de publicación del libro.
     * @return Año de publicación del libro.
     */
    public int getYear() {
        return this.year;
    }
    
    
    
    
}
