package com.pvae.app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "certificado")
public class CertificadoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idcertificado;

    @ManyToOne
    @JoinColumn(name = "participante_id", referencedColumnName = "idpersona")
    private ParticipanteModel participante;

    @ManyToOne
    @JoinColumn(name = "evento_id", referencedColumnName = "idevento")
    private EventoModel evento;

    @ManyToOne
    @JoinColumn(name = "estado_id", referencedColumnName = "idestado")
    private EstadoModel estado;

      public CertificadoModel() {
    }

    public CertificadoModel(ParticipanteModel participante, EventoModel evento) {
        this.participante = participante;
        this.evento = evento;
    }

    public CertificadoModel(ParticipanteModel participante, EstadoModel estado) {
        this.participante = participante;
        this.estado = estado;
    }

    public CertificadoModel(ParticipanteModel participante, EventoModel evento, EstadoModel estado) {
        this.participante = participante;
        this.evento = evento;
        this.estado = estado;
    }

    public long getIdcertificado() {
        return idcertificado;
    }

    public void setIdcertificado(long idcertificado) {
        this.idcertificado = idcertificado;
    }

    public ParticipanteModel getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipanteModel participante) {
        this.participante = participante;
    }

    public EventoModel getEvento() {
        return evento;
    }

    public void setEvento(EventoModel evento) {
        this.evento = evento;
    }

    public EstadoModel getEstado() {
        return estado;
    }

    public void setEstado(EstadoModel estado) {
        this.estado = estado;
    }


}