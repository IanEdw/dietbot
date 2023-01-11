package ru.ianedw.telegrambot.dietbot.models.person;

import jakarta.persistence.*;
import ru.ianedw.telegrambot.dietbot.models.Meals;
import ru.ianedw.telegrambot.dietbot.models.food.Dish;
import ru.ianedw.telegrambot.dietbot.models.food.Foodstuff;

import java.time.DayOfWeek;

@Entity
@Table(name = "FoodPreferences")
public class FoodPreferences {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String string;

    @ManyToOne
    @JoinColumn(name = "favor_id", referencedColumnName = "id")
    private Favor owner;

    @ManyToOne
    @JoinColumn(name = "dish_id", referencedColumnName = "id")
    private Dish dish;

    @ManyToOne
    @JoinColumn(name = "foodstuff_id", referencedColumnName = "id")
    private Foodstuff foodstuff;

    @Column(name = "meal")
    private Meals meal;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "day_of_week")
    private DayOfWeek dayOfWeek;

    public FoodPreferences() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Favor getOwner() {
        return owner;
    }

    public void setOwner(Favor favor) {
        this.owner = favor;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Foodstuff getFoodstuff() {
        return foodstuff;
    }

    public void setFoodstuff(Foodstuff foodstuff) {
        this.foodstuff = foodstuff;
    }

    public Meals getMeal() {
        return meal;
    }

    public void setMeal(Meals meals) {
        this.meal = meals;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
