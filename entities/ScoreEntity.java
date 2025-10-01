package com.unifacisa.fliperama.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "scores")
public class ScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "score")
    private Long score;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public ScoreEntity() {}
    public ScoreEntity(Long score, UserEntity user) {
        this.score = score;
        this.user = user;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getScore() { return score; }
    public void setScore(Long score) { this.score = score; }
    public UserEntity getUser() { return user; }
    public void setUser(UserEntity user) { this.user = user; }
}
