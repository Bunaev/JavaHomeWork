import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Task_007 {
    public static void main(String[] args) {
        MySet<Integer> myset = new MySet<>();

        System.out.println(myset.add(1));
        System.out.println(myset.add(2));
        System.out.println(myset.add(3));
        System.out.println(myset.add(4));
        System.out.println(myset.remove(3));
        System.out.println(myset);
        Iterator<Integer> iter = myset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        for (int i = 0; i < myset.readOfIndex().length; i++) {
            System.out.println(myset.readOfIndex()[i]);
        }
    }
}

class MySet<T> {
    private HashMap<T, Object> map = new HashMap<>();
    private static final Object myo = new Object();

    public boolean add(T value) {
        return map.put(value, myo) == null;
    }

    public boolean remove(T value) {
        return map.remove(value) == myo;
    }

    public String toString() {
        return map.keySet().toString();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    public Object[] readOfIndex(){
        return map.keySet().toArray();
    }
}


