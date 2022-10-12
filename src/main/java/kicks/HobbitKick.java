package kicks;

import lotr.Character;

public class HobbitKick implements Kick{
    @Override
    public void kick(Character whoKicks, Character toKick) {
        toCry();
    }
    public void toCry(){
        System.out.println("Tears, tears!!");
    }
}
