
public interface CellMapInterface<K,V> {
	
    static int SIZE_OF_MAP = 15;
    void put(K key, V value);
    V get(K key);
}
