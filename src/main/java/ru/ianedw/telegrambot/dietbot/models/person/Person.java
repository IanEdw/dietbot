package ru.ianedw.telegrambot.dietbot.models.person;

import jakarta.persistence.*;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "chat_id")
    private long chatId;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "owner")
    private Favor favor;

    @Column(name = "current_weight")
    private int currentWeight;

    @Column(name = "target_weight")
    private int targetWeight;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Favor getFavor() {
        return favor;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public void setFavor(Favor favor) {
        this.favor = favor;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getTargetWeight() {
        return targetWeight;
    }

    public void setTargetWeight(int targetWeight) {
        this.targetWeight = targetWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
