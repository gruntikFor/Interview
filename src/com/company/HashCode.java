import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashCode {
    public static void main(String[] args) {
        Pet2 kit = new Pet2("kit", 23);
        Pet2 kit2 = new Pet2("kit", 23);

        System.out.println(kit.equals(kit2));

        List<Pet2> list = new ArrayList<>();
        list.add(kit);

        System.out.println(list.contains(kit2));
        System.out.println(list.indexOf(kit2));

        Set<Pet2> set = new HashSet<>();
        set.add(kit);
        set.add(kit2);

        System.out.println("set size: " + set.size());
    }
}


class Pet2 implements Cloneable {
    public String name;
    public int age;

    public Pet2() {
    }

    public Pet2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printMe() {
        System.out.println("print me");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                " age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet2 pet2 = (Pet2) o;

//        if (age != pet2.age) return false;
        return name != null ? name.equals(pet2.name) : pet2.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + age;
        return result;
    }
}
