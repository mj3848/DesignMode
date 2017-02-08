package cn.majian.a;

public class SumsangFactory implements PhoneFactory{

	@Override
	public Phone CreatPhone() {
		return new Sumsang();
	}

}
