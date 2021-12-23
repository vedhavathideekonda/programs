package persistance;

public class UserDemo {
public static void main(String[] args) {
	Persistance fp=new FilePersistance();
	fp.persist();
	Persistance dp=new DataPersistance();
	dp.persist();
}
}
