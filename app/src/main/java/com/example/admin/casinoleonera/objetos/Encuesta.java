package com.example.admin.casinoleonera.objetos;

import android.widget.RadioButton;

/**
 * Created by admin on 20-02-2018.
 */

public class Encuesta {
    String planta;
    Float servicio;
    Float atencion;
    String sugerencia;

    public Encuesta() {
    }

    public Encuesta(String planta, Float servicio, Float atencion, String sugerencia) {
        this.planta = String.valueOf(planta);
        this.servicio = servicio;
        this.atencion = atencion;
        this.sugerencia = sugerencia;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public Float getServicio() {
        return servicio;
    }

    public void setServicio(Float servicio) {
        this.servicio = servicio;
    }

    public Float getAtencion() {
        return atencion;
    }

    public void setAtencion(Float atencion) {
        this.atencion = atencion;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    @Override
    public String toString() {
        return "Encuesta{" +
                "planta='" + planta + '\'' +
                ", servicio=" + servicio +
                ", atencion=" + atencion +
                ", sugerencia='" + sugerencia + '\'' +
                '}';
    }
}