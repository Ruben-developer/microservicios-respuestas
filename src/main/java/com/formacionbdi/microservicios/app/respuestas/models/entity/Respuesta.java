package com.formacionbdi.microservicios.app.respuestas.models.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.commons.examenes.models.entity.Pregunta;

@Entity
@Table(name = "Respuestas")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    @ManyToOne(fetch = FetchType.LAZY)
    private Alumno alumnos;

    @OneToMany(fetch = FetchType.LAZY)
    private Pregunta pregunta;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Alumno getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(Alumno alumnos) {
        this.alumnos = alumnos;
    }

    public Pregunta getPregunta() {
        return this.pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
    
}
