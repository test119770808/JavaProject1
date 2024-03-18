package quiz;

interface Animal {  //인터페이스 동물
	void sleep();
	void eat();
}

// 추가
interface Pet {
	void play();
}

class LandAnimal {
	void run() {
		System.out.println("육지 동물은 뛸 수 있습니다.");
	}
}

class MarineAnimal {
	void swim() {
		System.out.println("해양 동물은 헤엄을 칠 수 있습니다.");
	}
}

class Dog extends LandAnimal implements Animal, Pet {

	@Override
	public void sleep() {
		System.out.println("개는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}

	@Override
	public void play() {
		System.out.println("이 동물은 애완동물이 될 수 있습니다.");
	}	
	
	
}

class GoldFish extends MarineAnimal implements Animal{

	@Override
	public void sleep() {
		System.out.println("금붕어는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		System.out.println("금붕어는 플랑크톤을 먹습니다.");
	}
	
}

class Tiger extends LandAnimal implements Animal {

	@Override
	public void sleep() {
		System.out.println("호랑이는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}	
}

class Shark extends MarineAnimal implements Animal {

	@Override
	public void sleep() {
		System.out.println("상어는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		System.out.println("상어는 물고기를 먹습니다.");
	}
	
}



public class quiz3_240318_PM {

	public static void main(String[] args) {
		Dog dog = new Dog();
		GoldFish goldFish = new GoldFish();
		Tiger tiger = new Tiger();
		Shark shark = new Shark();
		dog.run();
		dog.sleep();
		goldFish.sleep();
		goldFish.swim();
		goldFish.eat();
		tiger.eat();
		shark.eat();
		play(dog);

	}
	
	public static void play(Pet pet) {
		pet.play();
	}

}
