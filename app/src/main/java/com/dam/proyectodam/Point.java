package com.dam.proyectodam;

/**
 *
 * Clase Point.java. Proyecto ARTrack. Diseño de Aplicaciones Móviles. 4º GITT.
 * Clase con los atributos que formarán parte de los atributos de la tabla en la
 * base de datos, y representan a un punto en el mapa, con la distancia recorrida
 * tras llegar a ese punto desde el anterior y la velocidad en el período
 * entre dos puntos consecutivos.
 *
 * Link del repositorio (GitHub):
 *  https://github.com/ramperher/ProyectoDAM
 *
 * @author Ramón Pérez, Alberto Rodríguez
 * @version 0.2 alfa
 *
 */
public class Point {

    /* Atributos de la clase: índice para la base de datos, latitud/longitud del punto,
    y distancia recorrida y velocidad entre un punto y el anterior. */
    private int id;
    private double latitud;
    private double longitud;
    private double distancia;
    private double velocidad;

    /**
     * Constructor de la clase Point
     *
     * @param id identificador único del punto (para la base de datos).
     * @param latitud latitud del punto.
     * @param longitud longitud del punto.
     * @param distancia distancia recorrida entre este punto y el anterior.
     * @param velocidad velocidad dada entre este punto y el anterior.
     */
    public Point (int id, double latitud, double longitud, double distancia, double velocidad) {
        this.id = id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.distancia = distancia;
        this.velocidad = velocidad;
    }

    /**
     * Método: getId
     * Devuelve el identificador del punto.
     *
     * @return el identificador del punto.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Método: setId
     * Fija el identificador del punto.
     *
     * @param id el identificador del punto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método: getLatitud
     * Devuelve la latitud del punto.
     *
     * @return la latitud del punto.
     */
    public double getLatitud() {
        return this.latitud;
    }

    /**
     * Método: setLatitud
     * Fija la latitud del punto.
     *
     * @param latitud la latitud del punto.
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * Método: getLongitud
     * Devuelve la longitud del punto.
     *
     * @return la longitud del punto.
     */
    public double getLongitud() {
        return this.longitud;
    }

    /**
     * Método: setLongitud
     * Fija la longitud del punto.
     *
     * @param longitud la longitud del punto.
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Método: getDistancia
     * Devuelve la distancia entre este punto y el anterior.
     *
     * @return dicha distancia.
     */
    public double getDistancia() {
        return this.distancia;
    }

    /**
     * Método: setDistancia
     * Fija la distancia de este punto al anterior.
     *
     * @param distancia dicha distancia.
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * Método: getVelocidad
     * Devuelve la velocidad entre este punto y el anterior.
     *
     * @return dicha velocidad.
     */
    public double getVelocidad() {
        return this.velocidad;
    }

    /**
     * Método: setVelocidad
     * Fija la velocidad de este punto al anterior.
     *
     * @param velocidad dicha velocidad.
     */
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
