public class Removable extends DataStorage{
    public Removable(String path, String data){
        super(path, data);
    }
    @Override
    public void getType() {
        System.out.printf("This is removable storage");
    }
}
