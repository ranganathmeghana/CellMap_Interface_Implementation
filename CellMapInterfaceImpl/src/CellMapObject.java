
public class CellMapObject {
	
    Key key;
    Value value;
    CellMapObject next;

    CellMapObject(Key key, Value value) {
        this.key = key;
        this.value = value;
    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public CellMapObject getNext() {
        return next;
    }

    public void setNext(CellMapObject next) {
        this.next = next;
    }


}
