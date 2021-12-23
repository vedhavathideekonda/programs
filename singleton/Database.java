package singleton;

class Database {
	   private static Database dbObject;

	   private Database() {      
	   }

	   public static Database getInstance() {
//get instance provides list of methods for use 
	      // create object if it's not already created
	      if(dbObject == null) {
	         dbObject = new Database();
	      }

	       // returns the singleton object
	       return dbObject;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	}



	
