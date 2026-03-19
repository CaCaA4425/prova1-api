package br.com.senac.prova1_api.Controller.dtos;

public class ProvaResponse {

    private int restoDivisao;
    private String imparPar;

    public int getRestoDivisao() {
        return restoDivisao;
    }

    public void setRestoDivisao(int restoDivisao) {
        this.restoDivisao = restoDivisao;
    }

    public String getImparPar() {
        return imparPar;
    }

    public void setImparPar(String imparPar) {
        this.imparPar = imparPar;
    }
}