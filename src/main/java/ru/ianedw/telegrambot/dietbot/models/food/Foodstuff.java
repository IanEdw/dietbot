package ru.ianedw.telegrambot.dietbot.models.food;

import jakarta.persistence.*;
import ru.ianedw.telegrambot.dietbot.models.person.FoodPreferences;

import java.util.List;

@Entity
@Table(name = "Foodstuff")
public class Foodstuff implements Food {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "carbohydrates")
    private double carbohydrates;

    @Column(name = "protein")
    private double protein;

    @Column(name = "fat")
    private double fat;

    @ManyToMany(mappedBy = "components")
    private List<Dish> dishes;

    @OneToMany(mappedBy = "foodstuff")
    private List<FoodPreferences> foodPreferencesList;

    public Foodstuff() {
    }

    @Override
    public double getCarbohydrates() {
        return carbohydrates;
    }

    @Override
    public double getProtein() {
        return protein;
    }

    @Override
    public double getFat() {
        return fat;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public List<FoodPreferences> getFoodPreferencesList() {
        return foodPreferencesList;
    }

    public void setFoodPreferencesList(List<FoodPreferences> foodPreferencesList) {
        this.foodPreferencesList = foodPreferencesList;
    }
}
