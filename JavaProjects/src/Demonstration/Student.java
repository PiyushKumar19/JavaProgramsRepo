package Demonstration;

public class Student {
	int RollNo;
	float fee;
	Student(int RollNo, float fee){
		this.RollNo=RollNo;
		this.fee=fee;
	}
	void display() {
		System.out.println(RollNo+" "+fee);
	}

}
