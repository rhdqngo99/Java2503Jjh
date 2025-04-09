package java2503.basic.oop;

public class InkjetPrinter extends AbstractPrinter{
	
	public InkjetPrinter(String sort, String company, String name, int price) {
		this.sort = sort;
		this.company = company;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void print() {
		System.out.println(sort + "타입의" + name + "프린터는 잉크를 이용해 출력하고 가격은" + price);
	}

}
