package waterball.c2m3h1;

public class HeroCollisionHandlerImpl implements CollisionHandler {
    @Override
    public boolean match(Character symbol) {
        return symbol.equals('H');
    }

    @Override
    public void handle() {

    }
}
