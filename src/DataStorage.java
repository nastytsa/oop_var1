import java.util.HashMap;
import java.util.Map;

public abstract class DataStorage {
    private Map<String, String> storage;

    public DataStorage(String path,  String data){
        storage = new HashMap<>();
        storage.put(path, data);
    }

    public String getData(String path){
        return storage.get(path);
    }

    public void addData(String path, String data){
        storage.put(path, data);
    }

    public abstract void getType();

    public void deleteData(String path){
        System.out.println(storage.get(path) + " has been removed from " + path);
        storage.remove(path);
    }

    public final void getSize(){
        System.out.println("This storage contains " + storage.size() + " data items.");
    }
}
