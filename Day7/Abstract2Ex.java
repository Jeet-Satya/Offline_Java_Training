abstract class Database{
abstract void Connection();
    void Disconnect(){
        System.out.println("Disconnecting from Database");
    }

} 

class MySQLDatabase extends Database{
    void Connection(){
        System.out.println("Connecting to MySQL Database");
    }
}

public  class Abstract2Ex {
    public static void main(String[] args) {
        MySQLDatabase db = new MySQLDatabase();
        db.Connection();
    }
}
