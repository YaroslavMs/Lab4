package lotr;

import kicks.NobleKick;
import java.util.Random;

public abstract class Noble extends Character{
    private static final Random rand = new Random();
    public Noble(int min, int max) {
        super(rand.nextInt(max - min) + min, rand.nextInt(max - min) + min, new NobleKick());
    }
}
