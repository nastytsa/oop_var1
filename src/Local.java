public class Local extends DataStorage{

    public Local(String path, String data) {
        super(path, data);
    }

    @Override
    public final void getType() {
        System.out.println("\nThis is local storage");
    }

    public final void getUser(){
        System.out.println("Owner of this local storage is Admin");
    }
}
