package waterball.c2m1h1.strategy;

import waterball.c2m1h1.model.Individual;
import waterball.c2m1h1.vo.IndividualVO;

import java.util.List;

public interface MatchmakingStrategy {
    List<IndividualVO> sort(Individual self, List<Individual> individualList);
}
