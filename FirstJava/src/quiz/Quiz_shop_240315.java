package quiz;

public class Quiz_shop_240315 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();

		b1.cash = 5000;

		b1.addToCart(new Coffee(1000, "이디야 원두"));
		b1.addToCart(new Coffee(1000, "이디야 원두"));
		b1.addToCart(new Coffee(1000, "이디야 원두"));
		b1.addToCart(new Coffee(1000, "이디야 원두"));

		b1.buyAll();
		b1.receipt();

		System.out.println("___cart____");
		b1.viewCart();
		System.out.println("___Trunk___");
		b1.viewTrunk();

		// Test
//		Buyer b1 = new Buyer();
//		b1.cash = 500000;
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Vaccine(69000, "V3"));
//		
//		b1.buyAll();
//		System.out.println("============= 카트 정보 ================");
//		b1.viewCart();
//		System.out.println("============= 트렁크 정보 ==============");
//		b1.viewTrunk();
//		b1.addToCart(new Coffee(15000,"커피빈 원두"));
//		b1.buyAll();
//		
//		b1.receipt();
//		
//		for (int i = 0; i <b1.t_index;i++) {
//			Product p = b1.trunk[i];
//			
//			if (p instanceof Vaccine) {
//				Vaccine v = (Vaccine)p;
//				v.checkComputer();
//			}else if(p instanceof Coffee) {
//				Coffee c = (Coffee)p;
//				c.drink();						
//			}else {
//				
//			}
//			
//		}

	}

}

class Buyer {
	int cash;
	int before_cash;
	protected int max_index = 5;
	protected int index = 0;
	protected int trunk_max_index = 5;
	protected int trunk_index = 0;
	int cart_index;

	protected Product[] cart = new Product[max_index];
	protected Product[] trunk = new Product[trunk_max_index];

	void buy(Product p) {
		if (!(cash >= p.getPrice())) {
			return;
		}

		addToTrunk(p);
		before_cash = cash;
		cash = cash - p.getPrice();
	}

	void buyAll() {
		before_cash = cash;

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				return;
			}

			addToTrunk(cart[i]);
			cash = cash - cart[i].getPrice();
		}
	}

	void addToCart(Product p) {
		if (index >= max_index) {
			max_index = max_index * 2;

		}

		if (cart_index != 0) {
			cart[cart_index] = p;
		} else {
			cart[index] = p;
		}

		index++;
	}

	void addToTrunk(Product p) {
		if (trunk_index >= trunk_max_index) {
			trunk_max_index = trunk_max_index * 2;
		}

		trunk[trunk_index] = p;

		trunk_index++;
	}

	void viewCart() {
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				return;
			}

			System.out.println(cart[i].getName());
		}
	}

	void viewTrunk() {
		for (int i = 0; i < trunk.length; i++) {
			if (trunk[i] == null) {
				return;
			}

			System.out.println(trunk[i].getName());
		}
	}

	void cancel(int cart_index) {
		cart[cart_index] = null;

		this.cart_index = cart_index;
	}

	void receipt() {
		int amount = 0;

		for (int i = 0; i < trunk.length; i++) {
			if (trunk[i] != null) {
				amount = amount + trunk[i].getPrice();
			}
		}

		System.out.println("사용 금액 : " + amount);
		System.out.println("남음 금액 : " + (before_cash - amount));

	}
	/*
	 * Buyer의 인스턴스 변수(상태) 필요한 만큼 사용해보세요.
	 */

	/*
	 * Buyer의 기능(method) 1. 메서드명 : buy 기능 : 지정한 물건(Product)을 구입한다. 바이어의 돈(cash)에서
	 * 물건의 가격을 빼고, 내 트렁크(trunk)에 담는다 만약 가진 돈이 부족하다면 구매할 수 없다. 리턴타입 : 없음 매개변수 :
	 * Product p
	 * 
	 */

	/*
	 * 2. 메서드 명 : buyAll 기능 : 장바구니(cart)에 지정된 모든 물건을 구매(buy)한다. 리턴타입 : 없음 매개변수 : 없음,
	 * Product[] cart
	 * 
	 */

	/*
	 * 3. 메서드 명 : addToCart 기능 : 지정한 물건을 장바구니에 담는다 만약에 장바구니에 담을 공간이 부족하면 장바구니 배열의
	 * 크기를 2배로 늘린 다음에 담는다. 리턴타입 : 없음 매개변수 : Product p
	 */

	/*
	 * 4. 메서드 명 : cancel 기능 : 지정한 물건을 장바구니에서 뺀다. 뺀 곳에는 다시 물건을 담을 수 있어야 한다. 리턴타입 : 없음
	 * 매개변수 : int cart_index
	 */

	/*
	 * 5. 매서드명 : receipt 기능 : 바이어가 구매한 물건의 목록과 사용금액 남은 금액을 출력한다. 리턴타입, 매개변수 : 없음
	 */

}

/*
 * Product 클래스를 상속받아서 상품을 3개 이상 만들어 보세요!!! (단, Product 클래스를 변경하면 안됨!!!!)
 */
class Product { // 부모 클래스 사용할 예정!!

	String name;
	private int price; // private : 내 클래스 내부에서만 사용하려고 함.

	public Product(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

class Coffee extends Product {
	public Coffee(String name) {
		this(0, name);
	}

	public Coffee(int price, String name) {
		super(price);

		this.name = name;
	}
}