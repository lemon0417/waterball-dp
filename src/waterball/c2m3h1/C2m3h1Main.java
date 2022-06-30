package waterball.c2m3h1;

import waterball.c2m3h1.model.World;
import waterball.c2m3h1.service.WorldService;

import java.util.List;

public class C2m3h1Main {
    public static void main(String[] args) {
        WorldService worldService = new WorldService(new World(30, 10));

        List<Character> world = worldService.create();

        print(world);
    }

    private static void print(List<Character> world) {
        world.forEach(System.out::print);
    }
}
