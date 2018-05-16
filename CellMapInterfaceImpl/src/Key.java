
public class Key {
	


    Object value;

    public Key(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }


    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Key key = (Key) obj;

        return (key.value == this.value);

    }

    @Override
    public int hashCode() {

        int result = 17;
        result = 37 * result + value.hashCode();
        return result;
    }


}
