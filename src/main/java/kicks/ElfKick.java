package kicks;

import lotr.Character;

public class ElfKick implements Kick{
    @Override
    public void kick(Character whoKicks, Character toKick) {
        if(whoKicks.getPower() > toKick.getPower())
            toKick.setHp(0);
        else
            whoKicks.setPower(whoKicks.getPower() - 1);
    }
}
