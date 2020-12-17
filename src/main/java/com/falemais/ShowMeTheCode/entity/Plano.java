package com.falemais.ShowMeTheCode.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Plano {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String nome;

    @Column
    private int tempoGratis;

    public enum Fields {
        ID("id"),NOME("nome"),TEMPOGRATIS("tempoGratis");

        private String fields;
        private Fields (String fields){
            this.fields = fields;
        }

        @Override
        public String toString(){
            return this.fields;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoGratis() {
        return tempoGratis;
    }

    public void setTempoGratis(int tempoGratis) {
        this.tempoGratis = tempoGratis;
    }

    @Override
    public String toString() {
        return "Plano{" +
                "id=" + id +
                ", nome=" + nome +
                ", tempoGratis=" + tempoGratis +
                '}';
    }
}
