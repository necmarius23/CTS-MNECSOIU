package ro.acs.csie.cts.g1094.singleton;

public class TestSingleton {

    public static void main(String[] args) {

//    DbConnection con1 = new DbConnection();
//    DbConnection con2 = new DbConnection();
//
//        DbConnection con1 = new DbConnection("127.0.0.1:3306","Db");
//    DbConnection con2 = new DbConnection("127.0.0.1:3306","Db");
//
//
//  DbConnection con1 = DbConnection.getInstance();
//    DbConnection con2 = DbConnection.getInstance();

        DbConnection con1 = DbConnection.getConnection("127.0.0.1:1443","cts");
        DbConnection con2 = DbConnection.getConnection("127.0.0.1:1443","cts");
    if(con1 == con2){
        System.out.println("They are pointing to the same database");
    }
    }


}
