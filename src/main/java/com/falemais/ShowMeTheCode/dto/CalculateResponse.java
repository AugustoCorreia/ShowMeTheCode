package com.falemais.ShowMeTheCode.dto;
import com.falemais.ShowMeTheCode.entity.Plano;

public class CalculateResponse {

    private String status;
    private Plano plano;
    private String codOrigem;
    private String codDestino;
    private Integer tempoLigacao;
    private Double valorSemPlano;
    private Double valorComPlano;



    public Integer getTempoLigacao() {
        return tempoLigacao;
    }

    public void setTempoLigacao(Integer tempoLigacao) {
        this.tempoLigacao = tempoLigacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

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

    public Double getValorSemPlano() {
        return valorSemPlano;
    }

    public void setValorSemPlano(Double valorSemPlano) {
        this.valorSemPlano = valorSemPlano;
    }

    public Double getValorComPlano() {
        return valorComPlano;
    }

    public void setValorComPlano(Double valorComPlano) {
        this.valorComPlano = valorComPlano;
    }
}
