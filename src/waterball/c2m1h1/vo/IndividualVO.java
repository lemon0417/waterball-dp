package waterball.c2m1h1.vo;

import waterball.c2m1h1.model.Individual;

public class IndividualVO {
    private long id;
    private double score;
    private Individual individual;

    public IndividualVO() {
    }

    public IndividualVO(long id, double score, Individual individual) {
        this.id = id;
        this.score = score;
        this.individual = individual;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }
}
