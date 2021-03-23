package ro.ase.csie.cts.g1094.singleton.registry;


public class TestResgistry {


    public static void main(String[] args) {

        DbConnection con1 = DbConnection.getDbConnection("127.0.0.1:1443","devDb");
        DbConnection con2 = DbConnection.getDbConnection("127.0.0.1:1443","devDb");

        if(con1 == con2){
            System.out.println("same");
        }
        DbConnection con3 = DbConnection.getDbConnection("127.0.0.1:1443","prodDb");
    }

}
