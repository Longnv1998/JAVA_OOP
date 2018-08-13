package QlCompany;

import java.util.Scanner;

public class Employee extends Person{
    private String department;
    private String role;
    private int idManager;

    public Employee() {
        super();
    }

    public Employee(String department, String role, int idManager) {
        super();
        this.department = department;
        this.role = role;
        this.idManager = idManager;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getIdManager() {
        return idManager;
    }

    public void setIdManager(int idManager) {
        this.idManager = idManager;
    }
    

    @Override
    public String toString() {
        return "Employee{"+" id= "+super.getId()+", name= "+super.getName()+", age= "+super.getAge() + ", department= " + department + ", role= " + role +", id_manager= "+idManager+ '}';
    }
    
    @Override
    public void Nhap() {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien: ");
        System.out.print("id: ");
        super.id=Integer.parseInt(nhap.nextLine());
        System.out.print("name: ");
        super.name=nhap.nextLine();
        System.out.print("age: ");
        super.age=Integer.parseInt(nhap.nextLine());
        System.out.print("department(Production, Accounting, Sales): ");
        String text = nhap.nextLine();
        if(!"Production".equals(text) && !"Accounting".equals(text) && !"Sales".equals(text)){
            System.out.println("Nhap sai phong ban");
            Nhap();
        }else{
            department = text;
            System.out.print("role(SalesEmployee, Developper, Accounting): ");
            String role_text = nhap.nextLine();
            if(!"SalesEmployee".equals(role_text) && !"Developper".equals(role_text) && !"Accounting".equals(role_text)){
                System.out.println("Nhap sai role");
                Nhap();
            }else{
                role=role_text;
            }      
        } 
    }
    @Override
    public void HienThi() {
        System.out.print("Hien thi thong tin nhan vien: ");
        System.out.print("\tid: "+super.getId());
        System.out.print("\tname: "+super.getName());
        System.out.print("\tage: "+super.getAge());
	System.out.print("\tdepartment: "+department);
        System.out.print("\trole: "+role);
        System.out.print("\tid manager: "+idManager);
    }
    
}
