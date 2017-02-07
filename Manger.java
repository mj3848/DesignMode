package cn.majian;

import java.util.ArrayList;

public class Manger {
	

	/**
	 * 1.MAnger���Ǳ��۲���
	 * 
	 * 2.�۲���һ���ǽӿ�
	 * 
	 * 3.�ڱ��۲����д洢�۲���
	 * 
	 * 4.֪ͨ�۲���
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
