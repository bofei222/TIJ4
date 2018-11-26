package test.java.generics;

import com.typeinfo.pets.Dog;
import com.typeinfo.pets.Pet;
import com.typeinfo.pets.Pug;

/**
 * @author bofei
 * @date 2018年8月8日 下午1:12:52 
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a) { this.a = a; }
    public void set(T a) { this.a = a; }
    public T get() { return a; }
    public static void main(String[] args) {
        Holder3<Pet> h3 = 
            new Holder3<Pet>(new Pet());
        Pet a = h3.get(); // No cast needed
        System.out.println(h3.get());
        // can also hold a subclass of Pet:
        h3.set(new Dog());
        System.out.println(h3.get());
        // can also hold a sububclass of Pet:
        h3.set(new Pug());
        System.out.println(h3.get());
    }
}
