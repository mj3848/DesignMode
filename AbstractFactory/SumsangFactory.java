package cn.majian.b;

public class SumsangFactory implements PhoneFactory{

	@Override
	public Phone CreatPhone() {
		return new Sumsang();
	}

	@Override
	public ProErji create() {
		
		return new SumsangErji();
	}

}
