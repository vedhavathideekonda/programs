package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class group1 {

	public static void main(String[] args) {
		List<News> news =  Arrays.asList(
      new News(1, "TU1", "U1", "News about budget"),
      new News(2, "TU2", "U2", "news about sports"),
      new News(3, "TU3", "U3", "great news about budget"),
      new News(4, "TU1", "U1", "News about budget details"),
      new News(2, "TU2", "U2", "news about sportsmeet")
      );
		//max comments posted user
		Optional<Object> c1=news.stream()
        .max(Comparator.comparing(News::getPostedByUser))
		.map(p->p.postedByUser);
		System.out.println(c1);
		//max comments posted user
				Optional<Object> c2=news.stream()
		        .max(Comparator.comparing(News::getNewsid))
				.map(p->p.newsid);
				System.out.println(c2);
				//comments
				List<String> c3=news.stream()
						.sorted((o1,o2) ->(o1.getComment().compareTo(o2.getComment())))
					   	.map(p->p.toString())
					   	.collect(Collectors.toList());
						System.out.println(c3);
	}
	}

