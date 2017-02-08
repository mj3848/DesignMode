package cn.majian;

public class PhoneFactory {
	
	public static Phone getDiffPhone(PhoneType ft){
		
			switch (ft) {
			case Apple:
				return new Apple() ;

			case Sumsang :
				return new Sumsang() ;
			}
		
			return null;
		
	}
}
