import java.util.Vector;

class Key{

	Object key_id;

	private Object getKey(){
		return this.key_id;
	}

	private void setKey(Object key_id){
		this.key_id = key_id;
	}


}

class Value{

	String value;


}

class KeyValuePair{

	Vector keySet;
	Vector valueSet;

	public KeyValuePair (){

		keySet = new Vector();
		valueSet = new Vector();

	}

	public void addPair (Object key, Object value){
		keySet.add(key);
		valueSet.add(value);
	}

	public Object getPair (Object key){

			
		
			int counter = 0;
			for (Object k : keySet){
				if (k == key){
					return valueSet.get(counter);
				}
				counter++;
			}

			return null;
		 
	}

}

class hashmapDemo{

	public static void main (String args[]){
		KeyValuePair myHash = new KeyValuePair();
		myHash.addPair(1,"a");
		myHash.addPair(2, "ba");

		System.out.println("Value for key 2 is " + myHash.getPair(2));
	}

}

