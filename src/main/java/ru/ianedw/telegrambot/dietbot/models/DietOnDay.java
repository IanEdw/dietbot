package ru.ianedw.telegrambot.dietbot.models;


import ru.ianedw.telegrambot.dietbot.models.food.Food;
import ru.ianedw.telegrambot.dietbot.models.person.Favor;

import java.util.List;

public class DietOnDay {
    private List<Food> breakfast;
    private List<Food> lunch;
    private List<Food> dinner;
    private Favor favor;
    private int goalCarbohydrates;
    private int goalProtein;
    private int goalFat;

    public DietOnDay(int currentWeight, int targetWeight, Favor favor) {
        setGoals(currentWeight, targetWeight);
        this.favor = favor;
    }

    private void setGoals(int currentWeight, int targetWeight) {
        int i =  targetWeight - currentWeight;
        if (i < 0) {
            goalCarbohydrates = 2 + targetWeight;
            goalProtein = 2 * targetWeight;
            goalFat = (int) (0.75 * targetWeight);
        } else if (i > 0) {
            goalCarbohydrates = 4 + targetWeight;
            goalProtein = 2 * targetWeight;
            goalFat = targetWeight;
        } else {
            goalCarbohydrates = 3 + targetWeight;
            goalProtein = (int) (2.5 * targetWeight);
            goalFat = (int) (0.75 * targetWeight);
        }
    }

    public String getDiet() {
        return null;
    }
}
