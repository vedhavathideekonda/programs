package Stream;

public class Transaction {
String Trader;
int  year;
int value;

public Transaction(String Trader,int year,int value) {
this.Trader=Trader;
this.year=year;
this.value=value;
}

public String getTrader() {
	return Trader;
}

public int getYear() {
	return year;
}

public int getValue() {
	return value;
}

public String toString(){
	return "Transaction[Trader="+Trader+",year="+year+",value="+value+"]";
}
}