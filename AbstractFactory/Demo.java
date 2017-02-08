package cn.majian.b;

public class Demo {
	
	public static void main(String[] args) {
		
		PhoneFactory pf = new AppleFactory() ;
		
		ProErji appleErji = pf.create() ;
		
		appleErji.Listen() ;
		
	}
}
