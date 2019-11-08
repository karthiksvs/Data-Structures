import java.util.*;
import java.io.*;
class Student implements Comparable<Student>{
	String name;
	String dob;
	int sub1;
	int sub2;
	int sub3;
	int marks;
	String category;
	boolean flag;
	Student(String name, String dob, int sub1, int sub2, int sub3, int marks, String category){
		this.name = name;
		this.dob = dob;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.marks = marks;
		this.category = category;
	}
	public int compareTo(Student stu) {
		if (this.marks < stu.marks)
			return 1;
		else if(this.marks > stu.marks)
			return -1;
		else{
			if (this.sub3 > stu.sub3)
				return -1;
			else if(this.sub3 < stu.sub3)
				return 1;
			else{
				if (this.sub2 > stu.sub2)
					return -1;
				else if(this.sub2 < stu.sub2)
					return 1;
				else
				{
					if (this.dob.compareTo(stu.dob) < 0)
						return 1;
					else if(this.dob.compareTo(stu.dob) > 0)
						return -1;
					else
						return 0;
				}
			}
		}
	}
}

class Selection{
	Student[] list;
	int vacancies;
	int open;
	int bcReserved;
	int scReserved;
	int stReserved;

	Selection(int no_of_Students, int no_of_positions,int open, int bcReserved, int scReserved, int stReserved) {
		list = new Student[no_of_Students];
		vacancies = no_of_positions;
		this.open = open;
		this.bcReserved = bcReserved;
		this.scReserved = scReserved;
		this.stReserved = stReserved;
	}

	public Student[] getSelectedList() {
		int bcCount = 0, stCount = 0, scCount = 0;
		for (int index = 0; index < list.length; index++){
			if (list[index].category.toLowerCase().equals("bc"))
				bcCount++;
			else if (list[index].category.toLowerCase().equals("sc"))
				scCount++;
			else if (list[index].category.toLowerCase().equals("st"))
				stCount++;
		}
		Arrays.sort(list);
		Student selected[] = new Student[vacancies];
		int selected_index = 0,copy = open;
		for (int index = 0; index<copy; index++,--open,--vacancies) {
			selected[selected_index++] = list[index];
			if (list[index].category.toLowerCase().equals("bc"))
				bcCount--;
			else if (list[index].category.toLowerCase().equals("sc"))
				scCount--;
			else if (list[index].category.toLowerCase().equals("st"))
				stCount--;
		}
		for (int index = copy; index<list.length && vacancies > 0; index++){
			if (list[index].category.toLowerCase().equals("bc") && bcReserved > 0) {
				selected[selected_index++] = list[index];
				vacancies--;
				bcReserved--;
				bcCount--;
			}
			else if(list[index].category.toLowerCase().equals("sc") && scReserved > 0){
				selected[selected_index++] = list[index];
				vacancies--;
				scReserved--;
				scCount--;
			}
			else if(list[index].category.toLowerCase().equals("st") && stReserved > 0){
				selected[selected_index++] = list[index];
				vacancies--;
				stReserved--;
				stCount--;
			}
			else if (bcReserved > 0 && bcCount <= 0) {
				selected[selected_index++] = list[index];
				bcCount--;
				bcReserved--;
				vacancies--;
			}
			else if (scReserved > 0 && scCount <= 0) {
				selected[selected_index++] = list[index];
				scCount--;
				scReserved--;
				vacancies--;
			}
			else if (stReserved > 0 && stCount <= 0) {
				selected[selected_index++] = list[index];
				stCount--;
				stReserved--;
				vacancies--;
			}
		}
		return selected;
	}
}
public class Solution {
	public static void main(String[] args) throws Exception {
		int no_of_testcases = 6;
		int i = 0;
		while(i < no_of_testcases){
			String inputFile = "testcases/input00"+i+".txt";
			String outputFile = "testcases/output00"+i+".txt";
			ReadInput(inputFile,outputFile);
			i++;
		}
	}
	public static void ReadInput(String inputFile, String outputFile) throws Exception{
		Scanner sc = new Scanner(new File(inputFile));
		int no_of_Students = Integer.parseInt(sc.nextLine());
		int no_of_positions = Integer.parseInt(sc.nextLine());
		int open = Integer.parseInt(sc.nextLine());
		int BC_count = Integer.parseInt(sc.nextLine());
		int SC_count = Integer.parseInt(sc.nextLine());
		int ST_count = Integer.parseInt(sc.nextLine());

		Selection sel_obj = new Selection(no_of_Students, no_of_positions, open, BC_count,SC_count,ST_count);
		for(int i = 0; i < no_of_Students; i++){
			String[] Student_info = sc.nextLine().split(",");
			Student stu_obj = new Student(Student_info[0],Student_info[1], Integer.parseInt(Student_info[2]),Integer.parseInt(Student_info[3]),Integer.parseInt(Student_info[4]),Integer.parseInt(Student_info[5]), Student_info[6]);
			sel_obj.list[i] = stu_obj;
		}
		Student[] finallist = sel_obj.getSelectedList();
		for(Student s:finallist)
			System.out.println(s.name);
		checkOutput(finallist, no_of_positions,outputFile);
	}
	public static void checkOutput(Student[] arr, int no_of_positions, String outputFile) throws Exception{
		Scanner sc = new Scanner(new File(outputFile));
		for(int i = 0; i < no_of_positions; i++){
			if(!sc.nextLine().equals(arr[i].name)){
				System.out.println("Your output is not matching with output in file "+ outputFile);
				return;
			}
		}
		System.out.println("your output with file "+ outputFile+" Matched. This Test case passed");
	}
}