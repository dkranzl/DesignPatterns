public class Client {

    public static void main(String[] args) {
        Database.getInstance().query("select * from users;");
    }
}
