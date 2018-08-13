package QlCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Person{
    private int numberEmployee;
    private ArrayList<Employee> List_empl;

    public Manager() {
        super();
    }

    public Manager(int numberEmployee, ArrayList<Employee> List_empl) {
        super();
        this.numberEmployee = numberEmployee;
        this.List_empl = List_empl;
    }

    public int getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(int numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public ArrayList<Employee> getList_empl() {
        return List_empl;
    }

    public void setList_empl(ArrayList<Employee> List_empl) {
        this.List_empl = List_empl;
    }

    @Override
    public String toString() {
        return "Manager{"+" id= "+super.getId()+", name= "+super.getName()+", age= "+super.getAge()+ ", numberEmployee=" + numberEmployee + ", List_empl=" + List_empl + '}';
    }
    

    @Override
    public void Nhap() {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap thong tin manager: ");
        System.out.print("id: ");
        super.id=Integer.parseInt(nhap.nextLine());
        System.out.print("name: ");
        super.name=nhap.nextLine();
        System.out.print("age: ");
        super.age=Integer.parseInt(nhap.nextLine());
        System.out.print("number Employee: ");
        numberEmployee=Integer.parseInt(nhap.nextLine());
    }

    @Override
    public void HienThi() {
        System.out.print("Hien thi thong tin manager: ");
        System.out.print("\tid: "+super.getId());
        System.out.print("\tname: "+super.getName());
        System.out.print("\tage: "+super.getAge());
	System.out.print("\tnumber Employee: "+numberEmployee);
        System.out.println("\tList employee :");
        for (Employee List_employee : List_empl) {
            System.out.println(List_employee);
        }
    }
    	
}
