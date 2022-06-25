package waterball.c2m1h1.strategy;

import waterball.c2m1h1.model.Coord;
import waterball.c2m1h1.model.Individual;
import waterball.c2m1h1.vo.IndividualVO;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistanceBasedMatchmakingStrategy implements MatchmakingStrategy {
    @Override
    public List<IndividualVO> sort(Individual self, List<Individual> individualList) {
        return individualList.stream().map(
                target -> {
                    double distance = calculate(self, target);
                    return new IndividualVO(target.getId(), distance, target);
                }
        ).sorted(Comparator.comparing(IndividualVO::getScore)
                .thenComparing(IndividualVO::getId)
        ).collect(Collectors.toList());
    }

    private double calculate(Individual self, Individual target) {
        Coord selfCoord = self.getCoord();
        Coord targetCoord = target.getCoord();
        return Math.sqrt(
                Math.pow((selfCoord.getY() - targetCoord.getY()), 2) +
                        Math.pow((selfCoord.getX() - targetCoord.getX()), 2)
        );
    }
}
