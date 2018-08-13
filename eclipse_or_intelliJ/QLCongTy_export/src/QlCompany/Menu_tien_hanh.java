package QlCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu_tien_hanh {

    //tạo collection để lưu dữ liệu nhận xuất
    ArrayList<Manager> list_m = new ArrayList<>();
    ArrayList<Employee> list_empl = new ArrayList<>();

    //tạo hàm static để chạy chương trình
    public static void main(String[] args) {
        //tạo hàm scan để quét và gán dữ liệu cho biến nhập vào
        Scanner nhap = new Scanner(System.in);
        //new 1 object của class menu_tien_hanh để gọi các method vào main 
        Menu_tien_hanh menu = new Menu_tien_hanh();
        //dùng while(true) để lặp menu nếu điều kiện switch đúng
        while (true) {
            System.out.println("=====MENU=====");
            System.out.println("1.Add employee and manager");
            System.out.println("2.Display number employee, manager in company");
            System.out.println("3.Display list manager : name,age,how many employees?");
            System.out.println("4.Display information follow id");
            System.out.println("5.Exit");
            System.out.print("======Choose : ");
            //nhận giá trị chọn cho biến choose
            int choose = Integer.parseInt(nhap.nextLine());
            //dùng switch để chia nhánh các chức năng
            switch (choose) {
                case 1:
                    //chức năng 1
                    menu.Add();
                    break;
                case 2:
                    //chức năng 2
                    menu.Display_number_E_M();
                    break;
                case 3:
                    //chức năng 3
                    menu.Display_list();
                    break;
                case 4:
                    //chức năng 4
                    menu.Display_information();
                    break;
                case 5:
                    //thoát
                    System.exit(0);
            }
        }
    }

    //viết method thực hiện chức năng của menu
    void Add() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("bạn muốn thêm : 1.manager or 2.employee");
        int chon = Integer.parseInt(nhap.nextLine());
        if (chon == 1) {
            System.out.println("Bạn đã chọn manager");
            Manager m = new Manager();
            m.Nhap();
            list_m.add(m);
        } else if (chon == 2) {
            System.out.println("Bạn đã chọn employee");
            if (list_m.size() == 0) {
                System.out.println("Bạn chưa có quản lý nào. Vui lòng thêm ít nhất 1 quản lý");
                Add();
            } else {
                Employee e = new Employee();
                System.out.println("ban muon nhap nhan vien thuoc quan ly nao: ");
                for (Manager list_manager : list_m) {
                    System.out.println(list_manager);
                }
                System.out.print("Vui lòng chọn mã quản lý: ");
                int id_ql = Integer.parseInt(nhap.nextLine());
                e.setIdManager(id_ql);
                e.Nhap();
                list_empl.add(e);
                list_m.get(id_ql-1).setList_empl(list_empl);
            }

        } else {
            Menu_tien_hanh menu = new Menu_tien_hanh();
            System.out.println("Nhap sai! nhap lai");
            menu.Add();
        }

    }

    void Display_number_E_M() {
        System.out.println("Tong so nhan vien: " +list_empl.size());
        System.out.println("Tong so quan ly: " +list_m.size());
    }

    void Display_list() {
        for (Manager a : list_m) {
            System.out.println(a);
        }
    }

    void Display_information() {
        Scanner nhap=new Scanner(System.in);
        System.out.print("Ban muon hien thi Manager hay Employee: ");
        String name_empl = nhap.nextLine();
        if("Manager".equals(name_empl)){
            System.out.print("Nhap id manager ban muon : ");
            int id_M = Integer.parseInt(nhap.nextLine());
            for (int i = 0; i < list_m.size(); i++) {
                if(id_M == list_m.get(i).getId()){
                    System.out.println("Thong tin manager theo id "+id_M+" la:");
                    System.out.println("\t id: "+id_M);
                    System.out.println("\t name: "+list_m.get(i).getName());
                    System.out.println("\t age: "+list_m.get(i).getAge());
                    System.out.println("\t number employee: "+list_m.get(i).getNumberEmployee());
                    System.out.println("\t list employee: "+list_m.get(i).getList_empl());
                    list_m.get(i).getList_empl();
                }else{
                    System.out.println("khong co id nao giong id ban nhap");
                }
            }
        }else if("Employee".equals(name_empl)){
            System.out.print("Nhap id employee ban muon : ");
            int id_E = Integer.parseInt(nhap.nextLine());
            for (int i = 0; i < list_empl.size(); i++) {
                if(id_E == list_empl.get(i).getId()){
                    System.out.println("Thong tin manager theo id "+id_E+" la:");
                    System.out.println("\t id: "+id_E);
                    System.out.println("\t name: "+list_empl.get(i).getName());
                    System.out.println("\t age: "+list_empl.get(i).getAge());
                    System.out.println("\t Department: "+list_empl.get(i).getDepartment());
                    System.out.println("\t role: "+list_empl.get(i).getRole());  
                }else{
                    System.out.println("khong co id nao giong id ban nhap");
                }
            }
        }else{
            System.out.println("Nhap sai");
        }
    }
}
