package waterball.c2m1h1.strategy;

import waterball.c2m1h1.model.Individual;
import waterball.c2m1h1.vo.IndividualVO;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HabitBasedMatchmakingStrategy implements MatchmakingStrategy {
    @Override
    public List<IndividualVO> sort(Individual self, List<Individual> individualList) {
        return individualList.stream().map(
                target -> {
                    double distance = calculate(self, target);
                    return new IndividualVO(target.getId(), distance, target);
                }
        ).sorted(Comparator.comparing(IndividualVO::getScore).reversed()
                .thenComparing(IndividualVO::getId)
        ).collect(Collectors.toList());
    }

    private double calculate(Individual self, Individual target) {
        List<String> intersection = self.getHabits().stream()
                .filter(target.getHabits()::contains)
                .collect(Collectors.toList());
        return intersection.size() * 1.0d;
    }
}
