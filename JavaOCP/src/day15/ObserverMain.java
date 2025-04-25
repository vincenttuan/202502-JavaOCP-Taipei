package day15;

public class ObserverMain {

	public static void main(String[] args) {
		Observer user1 = new UserObserver("小明");
		Observer user2 = new UserObserver("小華");
		Observer user3 = new UserObserver("小英");
		
		Subject news = new NewsSubject();
		news.add(user1);
		news.add(user3);
		news.notify("下課了");
		
		news.remove(user1);
		
		news.notify("放假了");
	}

}
