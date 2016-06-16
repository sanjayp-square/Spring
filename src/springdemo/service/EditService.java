package springdemo.service;


import springdemo.bean.Data;
import springdemo.dao.EditDao;

public class EditService {
	
	public Data edit(int id){
		
		Data data=new  EditDao().createConnection(id);
		return data;
	}

}
