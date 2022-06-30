package waterball.c2m3h1.model;

public class Hero implements Sprite  {
    private int hp = 30;

    @Override
    public char getSymbol() {
        return 'H';
    }
}
