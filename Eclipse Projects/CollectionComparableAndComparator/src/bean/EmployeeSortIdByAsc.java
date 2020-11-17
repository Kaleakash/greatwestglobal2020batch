package bean;

import java.util.Comparator;

public class EmployeeSortIdByAsc implements Comparator<Employee>{
@Override
public int compare(Employee arg0, Employee arg1) {
	// TODO Auto-generated method stub
	//System.out.println(arg0.getId()+" "+arg1.getId());
	//return arg0.getId()-arg1.getId();
	if(arg0.getId()==arg1.getId()) {
		return 0;
	}else if(arg0.getId()>arg1.getId()){
		return 1;
	}else {
		return -1;
	}
	
}
}
