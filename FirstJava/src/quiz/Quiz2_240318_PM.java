package quiz;


interface Feed {
	String getFood();
}

class Carnivore {  // 육식
	
}

class Herbivore {  // 초식
	
}

class Deer extends Herbivore implements Feed {  //사슴
	@Override
	public String getFood() {
		return "건초";
	}
}

class Lion extends Carnivore implements Feed {  //사자
	@Override
	public String getFood() {
		return "고기";
	}
}

class ZooKeaper {  //사육사
	
	public void feed(Feed feed) {
		System.out.println(feed.getFood()+"를 줍니다.");
	}
	
}


public class Quiz2_240318_PM {

	public static void main(String[] args) {
		ZooKeaper zk = new ZooKeaper();
		Lion lion = new Lion();
		Deer deer = new Deer();
		zk.feed(deer);
		zk.feed(lion);
	}

}
