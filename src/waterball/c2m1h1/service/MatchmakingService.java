package waterball.c2m1h1.service;

import waterball.c2m1h1.model.Individual;
import waterball.c2m1h1.strategy.MatchmakingStrategy;

import java.util.List;

public class MatchmakingService {
    private final Individual user;
    private final List<Individual> individualList;
    private final MatchmakingStrategy matchmakingStrategy;

    public MatchmakingService(Individual user, List<Individual> individualList, MatchmakingStrategy matchmakingStrategy) {
        this.user = user;
        this.individualList = individualList;
        this.matchmakingStrategy = matchmakingStrategy;
    }

    public Individual match() {
        return matchmakingStrategy
                .sort(user, individualList)
                .get(0).getIndividual();
    }
}
