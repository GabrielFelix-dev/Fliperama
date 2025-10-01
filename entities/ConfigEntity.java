package com.unifacisa.fliperama.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "config")
public class ConfigEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dificuldade;
    private int tempoPorPartida;
    private int numeroDeVidas;

    @OneToOne(mappedBy = "config")
    private GameEntity game;

    public ConfigEntity() {}
    public ConfigEntity(String dificuldade, int tempoPorPartida, int numeroDeVidas) {
        this.dificuldade = dificuldade;
        this.tempoPorPartida = tempoPorPartida;
        this.numeroDeVidas = numeroDeVidas;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getDificuldade() { return dificuldade; }

    public void setDificuldade(String dificuldade) { this.dificuldade = dificuldade; }

    public int getTempoPorPartida() { return tempoPorPartida; }

    public void setTempoPorPartida(int tempoPorPartida) { this.tempoPorPartida = tempoPorPartida; }

    public int getNumeroDeVidas() { return numeroDeVidas; }

    public void setNumeroDeVidas(int numeroDeVidas) { this.numeroDeVidas = numeroDeVidas; }

    public GameEntity getGame() { return game; }

    public void setGame(GameEntity game) { this.game = game; }
}
