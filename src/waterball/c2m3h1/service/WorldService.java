package waterball.c2m3h1.service;

import waterball.c2m3h1.model.World;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorldService {
    private World world;
    private final static List<Character> AVAILABLE_SPRITES;

    static {
        AVAILABLE_SPRITES = new ArrayList<>();
        AVAILABLE_SPRITES.add('H');
        AVAILABLE_SPRITES.add('W');
        AVAILABLE_SPRITES.add('F');
    }

    public WorldService(World world) {
        this.world = world;
    }

    public List<Character> create() {
        List<Character> sprite = new ArrayList<>();

        for (int i = 0; i < world.getWidth(); i++) {
            if (i < world.getTotalSprite()) {
                SecureRandom random = new SecureRandom();
                Character symbol = AVAILABLE_SPRITES.get(random.nextInt(AVAILABLE_SPRITES.size()));
                sprite.add(symbol);
            } else {
                sprite.add('_');
            }
        }
        Collections.shuffle(sprite);
        return sprite;
    }
}
