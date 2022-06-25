package waterball.c2m1h1;

import waterball.c2m1h1.model.Coord;
import waterball.c2m1h1.model.Gender;
import waterball.c2m1h1.model.Individual;
import waterball.c2m1h1.service.MatchmakingService;
import waterball.c2m1h1.strategy.HabitBasedMatchmakingStrategy;

import java.util.ArrayList;
import java.util.List;

public class C2m1h1Main {
    private static final List<Individual> individuals = new ArrayList<>();

    static {
        individuals.add(new Individual(1, Gender.MALE, 25, "Hi", List.of("看小說", "爬山", "騎車"), new Coord(1, 2)));
        individuals.add(new Individual(2, Gender.FEMALE, 30, "Hi", List.of("瑜珈"), new Coord(2, 5)));
        individuals.add(new Individual(3, Gender.FEMALE, 21, "Hi", List.of("看電影", "踏青"), new Coord(5, 5)));
        individuals.add(new Individual(4, Gender.MALE, 34, "Hi", List.of("騎車"), new Coord(10, 4)));
        individuals.add(new Individual(5, Gender.MALE, 23, "Hi", List.of("瑜珈", "踏青"), new Coord(4, 1)));
    }

    public static void main(String[] args) {
        Individual user = new Individual(99999, Gender.MALE, 35, "Hi", List.of("看小說", "看電影", "騎車"), new Coord(1, 2));
        Individual match = new MatchmakingService(
                user,
                individuals,
                new HabitBasedMatchmakingStrategy()
        ).match();
        System.out.println(match.getId());
    }
}
