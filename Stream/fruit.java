package Stream;

public class fruit {
String name;
int calories;
int price;
String color;
public fruit(String name,int calories,int price,String color) {
this.name=name;
this.calories=calories;
this.price=price;
this.color=color;

}
public String toString(){
	return "fruit[name="+name+",calories="+calories+",price="+price+",color ="+color+"]";
}
public String getName() {
	return name;
}
public int getCalories() {
	return calories;
}
public int getPrice() {
	return price;
}
public String getColor() {
	return color;
}
}