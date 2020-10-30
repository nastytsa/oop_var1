public class FlashDrive extends Removable{

    public FlashDrive(String path, String data) {
        super(path, data);
    }

    @Override
    public final void getType() {
        super.getType();
        System.out.println(": flash drive");
    }
}
