package kicks;

import lotr.Character;

public class NobleKick implements Kick{
    @Override
    public void kick(Character whoKicks, Character toKick) {
        toKick.setHp(toKick.getHp() - whoKicks.getPower());
    }
}
