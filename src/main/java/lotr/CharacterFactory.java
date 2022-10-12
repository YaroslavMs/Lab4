package lotr;

import org.apache.log4j.BasicConfigurator;
import org.reflections.Reflections;
import java.lang.reflect.Modifier;
import java.util.Random;
import java.util.Set;


public class CharacterFactory {
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        Character  a = createCharacter();
        Character b = createCharacter();
        System.out.println("Two fighters:\n" + a + "\n" + b);
        GameManager.Fight(a, b);
    }

    public static Character createCharacter() throws Exception {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> set = reflections.getSubTypesOf(Character.class);
        set.removeIf(aClass -> Modifier.isAbstract(aClass.getModifiers()));
        System.out.println(set);
        Class[] arr = set.toArray(new Class[set.size()]);
        return (Character) arr[new Random().nextInt(arr.length)].getDeclaredConstructor().newInstance();
    }
}