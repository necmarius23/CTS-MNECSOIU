package ro.ase.csie.cts.g1094.singleton.staticref;


public class DbConnection {

    String connString;
    String schema;

    //eager-instantiation
    public final static DbConnection connection = new DbConnection();
    //static class initializer
    static {
        //called only once before the class is loaded by the JVM
        System.out.println("Hello. DbConnection is loaded");
    }
    //constructor initializer
    {
            //called every time before any constructor call
        System.out.println("Building an object");
        connection.connString = "127.0.0.1:1443";
        schema = "cts";
    }

    private DbConnection()
    {
        System.out.println("Creating a connection object");
        System.out.println("Loading configuration ");
        this.connString = "127.0.0.1:1443";
        this.schema = "cts";

    }

}