package database;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
@Component
public class Configurationfile {

@Value("${url}")
private String url;
@Value("${driverclassname}")
private String driverclassname;
@Value("${username}")
private String username;
@Value("${password}")
private String  password;

public String username() {
	return username;
}
public String  password() {
	return password;
}

public String driverclassname() {
	return driverclassname;
}


public String Url() {
	return url;
}
}
