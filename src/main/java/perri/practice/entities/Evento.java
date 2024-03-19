package perri.practice.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Evento {
    @Id
    @GeneratedValue
    public long id;

    public String titolo;

    public LocalDate data;

    public String descrizione;

    @Enumerated(EnumType.STRING)
    public EventoType tipoEvento;

    public long maxPartecipanti;

    public Evento() {
    }

    public Evento(String titolo, LocalDate data, String descrizione, long maxPartecipanti, EventoType tipoEvento) {
        this.data = data;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.maxPartecipanti = maxPartecipanti;
        this.tipoEvento = tipoEvento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public EventoType getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(EventoType tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public long getMaxPartecipanti() {
        return maxPartecipanti;
    }

    public void setMaxPartecipanti(long maxPartecipanti) {
        this.maxPartecipanti = maxPartecipanti;
    }

}
