package cn.majian.a;

public class Demo {
	
	public static void main(String[] args) {
		
		PhoneFactory ff = new AppleFactory() ;
		
		Phone apple = ff.CreatPhone() ;
		
		apple.Doing() ;
		
		/*Apple app = (Apple) apple ;
		app.love() ;*/
		
	}
}
