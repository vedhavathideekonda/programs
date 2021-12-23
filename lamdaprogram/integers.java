package lamdaprogram;

public class integers {
int values;

public integers(int values) {
	this.values=values;
}

public int getValues() {
	return values;
}

public void setValues(int values) {
	this.values = values;
}
public String toString(){
	return "integers[values="+values+"]";
}
}
