package cn.majian;

import java.util.ArrayList;

public class Manger {
	

	/**
	 * 1.MAnger就是被观察者
	 * 
	 * 2.观察者一般是接口
	 * 
	 * 3.在被观察者中存储观察者
	 * 
	 * 4.通知观察者
	 * 
	 */
	
	public interface Observer{
		public void StateChanged() ;
	}
	
	private ArrayList<Observer> list = new ArrayList<Observer>();
	
	
	//3.
	public void SavedObserver(Observer obs){
		if(!list.contains(obs)){
			list.add(obs) ;
		}
	}
	
	//4.
	public void NotifyObserver(){
		for (int i = 0; i < list.size(); i++) {
			Observer observer = list.get(i) ;
			observer.StateChanged() ;
		}
	}
	
	

}
