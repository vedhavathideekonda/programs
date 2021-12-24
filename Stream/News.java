package Stream;

public class News {
int newsid;
String postedByUser;
String commentByUser;
String Comment;


public News(int newsid,String postedByUser,String commentByUser,String Comment) {
	this.newsid=newsid;
	this.commentByUser=commentByUser;
	this.postedByUser=postedByUser;
	this.Comment=Comment;
}


public int getNewsid() {
	return newsid;
}


public String getPostedByUser() {
	return postedByUser;
}


public String getCommentByUser() {
	return commentByUser;
}


public String getComment() {
	return Comment;
}
public String toString(){
	return "News[newsid="+newsid+",postedByUser="+postedByUser+",commentByUser="+commentByUser+",Comment ="+Comment+"]";

}
}