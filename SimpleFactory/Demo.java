package cn.majian;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Phone sum = PhoneFactory.getDiffPhone(PhoneType.Sumsang) ;
		
		sum.Doing() ;
		
		Phone apple = PhoneFactory.getDiffPhone(PhoneType.Apple) ;
		
		apple.Doing() ;
	}

}
