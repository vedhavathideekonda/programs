package annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.sql.Time;
import java.util.Date;

@Retention(RUNTIME)
@Target(METHOD)
@interface info {

}
public class InfoTestdevelopers{
@info
public void authorid(int auth_id) {
	System.out.println("authorid"+auth_id);
}
@info
public void author(String author) {
	System.out.println("author"+author);
}

@info
public void date(Date attime) {
	System.out.println("Date"+attime);
}
@info
public void time(Time time) {
	System.out.println("time"+time);
}
@info
public void version(double version) {
	System.out.println("version"+version);
}

	public static void main(String[] args) {
		InfoTestdevelopers info=new InfoTestdevelopers();
		info.authorid(1);
		info.author("ram");
		info.date(new java.util.Date());
        info.time(new java.sql.Time(0));
        info.version(1.8);
	}

}
