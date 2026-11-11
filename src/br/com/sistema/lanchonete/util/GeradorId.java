package br.com.sistema.lanchonete.util;

public class GeradorId {
    private static GeradorId instance;
    private int contadorId;

    private GeradorId() {
    }

    public static GeradorId getInstance() {
        if (instance == null) {
            instance = new GeradorId();
        }
        return instance;
    }

    public int proximoId() {
        contadorId++;
        return contadorId;
    }
}
