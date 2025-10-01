package com.unifacisa.fliperama.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "games")
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String genero;

    @ManyToMany(mappedBy = "gameEntities")
    private List<UserEntity> userEntities = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "config_id", referencedColumnName = "id")
    private ConfigEntity config;

    public GameEntity() {}
    public GameEntity(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public List<UserEntity> getUserEntities() { return userEntities; }
    public void setUserEntities(List<UserEntity> userEntities) { this.userEntities = userEntities; }
    public ConfigEntity getConfig() { return config; }
    public void setConfig(ConfigEntity config) { this.config = config; }
}
