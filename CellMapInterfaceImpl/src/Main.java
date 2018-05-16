
public class Main {
	
	public static void main(String[] args) {
        CellMapImpl callMapImpl = new CellMapImpl();
        System.out.println("Adding New Element!!!");
        Key key1 = new Key("key1");
        Value value1 = new Value("value1");
        callMapImpl.put(key1,value1 );
        Value get_value1 = new CellMapImpl().get(key1);
        System.out.println("Get value - " + get_value1);

        System.out.println();
        System.out.println("Adding Duplicate!!!");
        callMapImpl.put(key1, new Value("value11"));
        // the above value "value11" should replace the old value "value1"
        Value value11 = new CellMapImpl().get(key1);
        System.out.println("Get duplicate value - " + value11);

        System.out.println();
        System.out.println("Adding New Element!!!");
        Key key2 = new Key("key2");
        Value value2 = new Value("value2");
        callMapImpl.put(key2,value2 );
        Value get_value2 = new CellMapImpl().get(key2);
        System.out.println("Get value - " + get_value2);
        
        System.out.println();
        System.out.println("Adding a null value!!!");
        Key key3 = new Key("key2");
        Value value3 = null;
        callMapImpl.put(key3,value3 );
        
        System.out.println();
        System.out.println("Adding a null key!!!");
        Key key4 = null;
        Value value4 = new Value("value3");
        callMapImpl.put(key4,value4 );
             
    }


}
