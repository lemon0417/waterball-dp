package waterball.c2m1h1.model;

import java.util.ArrayList;
import java.util.List;

public class Individual {
    private long id;
    private Gender gender;
    private int age;
    private String intro;
    private List<String> habits = new ArrayList<>();
    private Coord coord = new Coord(1, 1);

    public Individual() {
    }

    public Individual(
            long id,
            Gender gender,
            int age,
            String intro,
            List<String> habits,
            Coord coord
    ) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.intro = intro;
        this.habits = habits;
        this.coord = coord;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public List<String> getHabits() {
        return habits;
    }

    public void setHabits(List<String> habits) {
        this.habits = habits;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }
}
