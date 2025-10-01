package com.unifacisa.fliperama.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(nullable = false)
    private Long idade;

    @ManyToMany
    @JoinTable(name = "user_games",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "game_id"))
        private List<GameEntity> gameEntities = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<ScoreEntity> scoreEntities = new ArrayList<>();

    public UserEntity() {}
    public UserEntity(String nickname, Long idade) {
        this.nickname = nickname;
        this.idade = idade;
    }

    // Getters & Setters
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public Long getIdade() { return idade; }
    public void setIdade(Long idade) { this.idade = idade; }
    public List<GameEntity> getGameEntities() { return gameEntities; }
    public void setGameEntities(List<GameEntity> gameEntities) { this.gameEntities = gameEntities; }
    public List<ScoreEntity> getScoreEntities() { return scoreEntities; }
    public void setScoreEntities(List<ScoreEntity> scoreEntities) { this.scoreEntities = scoreEntities; }
}
