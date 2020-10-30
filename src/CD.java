public class CD extends Removable{

    public CD(String path, String data) {
        super(path, data);
    }

    @Override
    public final void getType() {
        super.getType();
        System.out.println(": compact disk");
    }
}
