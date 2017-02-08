package cn.majian.a;

public class AppleFactory implements PhoneFactory{

	@Override
	public Phone CreatPhone() {
		return new Apple();
	}

}
