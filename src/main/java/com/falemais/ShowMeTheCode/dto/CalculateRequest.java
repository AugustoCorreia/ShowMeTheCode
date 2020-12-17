package com.falemais.ShowMeTheCode.dto;

import com.falemais.ShowMeTheCode.entity.Plano;

public class CalculateRequest {
    private String codOrigem;
    private String codDestino;
    private int tempoLigacao;
    private Plano plano;

    public String getCodOrigem() {
        return codOrigem;
    }

    public void setCodOrigem(String codOrigem) {
        this.codOrigem = codOrigem;
    }

    public String getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(String codDestino) {
        this.codDestino = codDestino;
    }

    public int getTempoLigacao() {
        return tempoLigacao;
    }

    public void setTempoLigacao(int tempoLigacao) {
        this.tempoLigacao = tempoLigacao;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
