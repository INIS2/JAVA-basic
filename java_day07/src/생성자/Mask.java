package 생성자;

public class Mask {

		// 멤버변수(역할), 전역변수(범위), 인스턴스변수(객체생성 후 실제)
		String color;
		int price;
		int count;
		
		//생성자 제네레이트
		public Mask(String color, int price, int count) {
			super();
			this.color = color;
			this.price = price;
			this.count = count;
		}

		@Override
		public String toString() {
			return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
		}
		
		
}
