public class Test {

    public static void main(String args[]){
        Local local = new Local("C:/Users/myfile", "Important info");
        Web web = new Web("https://site", "Media content");
        CD cd = new CD("CD-ROM:/movie", "Harry Potter and the Goblet of Fire");
        FlashDrive flash = new FlashDrive("E:/document1", "KA-86 group list");
        System.out.println("Check flash:");
        flash.getSize();
        System.out.println("Add new file to flash");
        flash.addData("E:/document2", "KA-87 group list");
        flash.getSize();
        System.out.println("\nTry to access web storage:");
        web.denyAccess();
        System.out.println("\nCheck cd:");
        cd.getType();
        System.out.println("\nCheck C:/Users/myfile in local storage: " + local.getData("C:/Users/myfile") +
                "\nDelete this file:");
        local.deleteData("C:/Users/myfile");
        local.getUser();
    }
}
