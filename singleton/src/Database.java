public class Database {

    private static final Database instance = new Database();

    public static Database getInstance() {
        return instance;
    }

    private Database() {
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
