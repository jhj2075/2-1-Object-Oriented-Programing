package java_5;

public class Dictionary extends PairMap{
    private int i;
    private int size;
    public Dictionary(int size){
        i = 0;
        this.size = size;
        keyArray = new String[size];
        valueArray = new String[size];
    }
    String get(String key){
        int k = 0;
        while(true){
            if(key.equals(keyArray[k]))
                return valueArray[k];
            k++;
        }
    }

    void put(String key, String value){
        int index = i;
        int k = 0;
        while(true){
            if (keyArray[k] == null){
                index = k;
                break;
            }
            k++;
        }
        keyArray[index] = key;
        valueArray[index] = value;
        i++;
    }

    String delete(String key){
        String temp = get(key);
        int index = i;
        int k = 0;
        while(true){
            if(key.equals(keyArray[k])) {
                index = k;
                break;
            }
            k++;
        }
        valueArray[index] = null;
        i--;
        return temp;
    }

    int length(){
        return i;
    }
}
