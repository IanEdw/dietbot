package ru.ianedw.telegrambot.dietbot.models.person;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Favor")
public class Favor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person owner;

    @Column(name = "breakfast_part_carbohydrates")
    private double breakfastPartCarbohydrates;

    @Column(name = "lunch_part_carbohydrates")
    private double lunchPartCarbohydrates;

    @Column(name = "dinner_part_carbohydrates")
    private double dinnerPartCarbohydrates;

    @OneToMany(mappedBy = "owner")
    private List<FoodPreferences> foodPreferences;

    public Favor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }

    public double getBreakfastPartCarbohydrates() {
        return breakfastPartCarbohydrates;
    }

    public void setBreakfastPartCarbohydrates(double breakfastPartCarbohydrates) {
        this.breakfastPartCarbohydrates = breakfastPartCarbohydrates;
    }

    public double getLunchPartCarbohydrates() {
        return lunchPartCarbohydrates;
    }

    public void setLunchPartCarbohydrates(double lunchPartCarbohydrates) {
        this.lunchPartCarbohydrates = lunchPartCarbohydrates;
    }

    public double getDinnerPartCarbohydrates() {
        return dinnerPartCarbohydrates;
    }

    public void setDinnerPartCarbohydrates(double dinnerPartCarbohydrates) {
        this.dinnerPartCarbohydrates = dinnerPartCarbohydrates;
    }

    public List<FoodPreferences> getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(List<FoodPreferences> foodPreferences) {
        this.foodPreferences = foodPreferences;
    }
}
