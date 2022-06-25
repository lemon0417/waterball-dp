package waterball.c2m1h1.strategy;

import waterball.c2m1h1.model.Individual;
import waterball.c2m1h1.vo.IndividualVO;

import java.util.Collections;
import java.util.List;

public class ReverseMatchmakingStrategy implements MatchmakingStrategy {
    private final MatchmakingStrategy matchmakingStrategy;

    public ReverseMatchmakingStrategy(MatchmakingStrategy matchmakingStrategy) {
        this.matchmakingStrategy = matchmakingStrategy;
    }

    @Override
    public List<IndividualVO> sort(Individual self, List<Individual> individualList) {
        List<IndividualVO> result = matchmakingStrategy.sort(self, individualList);
        Collections.reverse(result);
        return result;
    }
}
