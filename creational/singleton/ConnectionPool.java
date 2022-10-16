public class ConnectionPool {

  private static ConnectionPool instance = new ConnectionPool();
  
  private ConnectionPool(){
    
  }
  
  public static ConnectionPool getInstance() {
        return instance;
  }
}
