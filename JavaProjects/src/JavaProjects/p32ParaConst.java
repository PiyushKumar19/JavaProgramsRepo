package JavaProjects;
import java.util.*;

public class p32ParaConst {
	
	int id;
	String Name;
	
	p32ParaConst(int i, String n){
		id=i;
		Name=n;
	}
	
	public void show() {
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+Name);
	}

	public static void main(String[] args) {
		p32ParaConst p=new p32ParaConst(11, "Piyush");
		p.show();

	}

}
