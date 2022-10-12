package lotr;
import kicks.Kick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    @Getter @Setter
    private int power;
    private Kick kick;

    public void kick(Character characterToKick){
        kick.kick(this, characterToKick);
    }

    public boolean isAlive(){
        return getHp() > 0;
    }
    public void setHp(int hp){
        this.hp = Math.max(0, hp);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
