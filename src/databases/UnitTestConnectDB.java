package databases;

public class UnitTestConnectDB {
    public static void main(String[] args){

        ConnectToMongoDB connectToSqmongodb = new ConnectToMongoDB();
        //ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //try{ConnectToSqlDB.connectToSqlDatabase();}catch (Exception e)

        try{ConnectToMongoDB.connectToMongoDB();}catch (Exception e)
        {
            System.out.println("Error result is : "+ e);}

    }
}