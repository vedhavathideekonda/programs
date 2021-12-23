package persistance;

abstract class Persistance {
abstract void persist();
}
class FilePersistance extends Persistance{
	void persist() {
	System.out.println("this data is from FilePersistance");
}
}
class DataPersistance extends Persistance{
	void persist() {
	System.out.println("this data is from DataPersistance");
}
}