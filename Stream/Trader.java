package Stream;

public class Trader {
String name;
String city;

public Trader(String name, String city) {
	this.name=name;
	this.city=city;
}

public String getName() {
	return name;
}

public String getCity() {
	return city;
}

public String toString(){
	return "Trader[name="+name+",city="+city+"]";
}
}