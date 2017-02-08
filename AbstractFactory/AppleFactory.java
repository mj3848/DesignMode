package cn.majian.b;

public class AppleFactory implements PhoneFactory{

	@Override
	public Phone CreatPhone() {
		return new Apple();
	}

	@Override
	public ProErji create() {
		return new AppleErji();
	}

}
