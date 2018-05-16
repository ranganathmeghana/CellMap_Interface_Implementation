
public class CellMapImpl implements CellMapInterface<Key, Value>  {
	
    private static CellMapObject cellMapObjectArray[] = new CellMapObject[SIZE_OF_MAP];
    static int topOfArray;

    @Override
    public void put(Key key, Value value) {
    	if(key == null){
    		
    		throw new IllegalArgumentException("Key cannot be null");
    	}
    	
    	
        for (int i = 0; i < SIZE_OF_MAP; i++) {
            CellMapObject elementInBucket = cellMapObjectArray[i];

            	 if (elementInBucket != null && elementInBucket.key.equals(key) ) {
            		 
            		 if(value == null){
                     System.out.println("removing key "
                             + key + ", removing it's value " + elementInBucket.value);
                     elementInBucket.key = null;
                     elementInBucket.value = null;
                     return;
            		 }
            		 
            		 else{
            			 
            			 System.out.println("duplicate key, replacing existing key "
                                 + key + ", with new value " + value);
                         elementInBucket.value = value;
                         return;
            		 }
                 } 
        }

        while(topOfArray<SIZE_OF_MAP)
        {
            System.out.println("Adding new key: " + key + ", value:" + value + " to the map");
            CellMapObject newCellMapObject = new CellMapObject(key, value);
            newCellMapObject.next = cellMapObjectArray[topOfArray];
            cellMapObjectArray[topOfArray] = newCellMapObject;
            topOfArray++;
            return;
        }
    }

    @Override
    public Value get(Key key) {

        for (int i = 0; i < SIZE_OF_MAP; i++) {
            CellMapObject elementInBucket = cellMapObjectArray[i];

            while (elementInBucket != null) {
                System.out
                        .println("Finding the key "
                                + elementInBucket.getKey());
                if (elementInBucket.key.equals(key)) {
                    System.out
                            .println("Key Found, Value is "
                                    + elementInBucket.getValue());
                    return elementInBucket.getValue();
                }
                elementInBucket = elementInBucket.next;
            }
        }
        throw new NullPointerException("Element not found");
    }



}
