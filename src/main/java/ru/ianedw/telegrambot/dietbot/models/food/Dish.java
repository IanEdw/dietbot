package ru.ianedw.telegrambot.dietbot.models.food;

import jakarta.persistence.*;
import ru.ianedw.telegrambot.dietbot.models.person.FoodPreferences;

import java.util.List;

@Entity
@Table(name = "Dish")
public class Dish implements Food {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "foodstuff_dish",
            joinColumns = @JoinColumn(name = "dish_id"),
            inverseJoinColumns = @JoinColumn(name = "foodstuff_id")
    )
    private List<Foodstuff> components;

    @OneToMany(mappedBy = "dish")
    private List<FoodPreferences> foodPreferencesList;

    @Override
    public double getCarbohydrates() {
        return components.stream().mapToDouble(Foodstuff::getCarbohydrates).sum();
    }

    @Override
    public double getProtein() {
        return components.stream().mapToDouble(Foodstuff::getProtein).sum();
    }

    @Override
    public double getFat() {
        return components.stream().mapToDouble(Foodstuff::getFat).sum();
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

    public List<Foodstuff> getComponents() {
        return components;
    }

    public void setComponents(List<Foodstuff> components) {
        this.components = components;
    }

    public List<FoodPreferences> getFoodPreferencesList() {
        return foodPreferencesList;
    }

    public void setFoodPreferencesList(List<FoodPreferences> foodPreferencesList) {
        this.foodPreferencesList = foodPreferencesList;
    }
}
