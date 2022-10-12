package lotr;

import kicks.ElfKick;
import kicks.Kick;

public class Elf extends Character{
    public Elf() {
        super(10, 10, new ElfKick());
    }
}
