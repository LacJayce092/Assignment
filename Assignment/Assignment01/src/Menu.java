import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static void menuTong(){
      //  boolean menutong = true;
       // if(menutong) {
            System.out.println("--- Chao mung den voi VTC Academy ---");
            System.out.println("=======================================");
            System.out.println("1. Quan li danh sach hoc vien");
            System.out.println("2. Quan li lop hoc");
            System.out.println("3. Quan li diem thi");
            System.out.println("0. Thoat");
            System.out.print("#Chon : ");
            System.out.println();
            System.out.println("=======================================");
            int n = sc.nextInt();
            System.out.println();
            while (n != 0 && n != 1 && n != 2 && n!= 3){
                System.out.print("Chon sai ! Vui long chon lai :");
                 n = sc.nextInt();
            }
            if(n == 2)
                menuClass();

       // } else
        //    menutong = false;
      //  return menutong;
    }

    public static void menuClass(){
        //boolean menuclass = true;
        //if(menuclass) {
            System.out.println("Quan li lop");
            System.out.println("1. Xem danh sach lop");
            System.out.println("2. Cap nhat thong tin lop");
            System.out.println("3. Them moi mot lop");
            System.out.println("0. Tro ve menu chinh");
            System.out.print("#Chon : ");
            int m = sc.nextInt();
            while (m != 0 && m != 1 && m != 2 && m!= 3){
            System.out.print("Chon sai ! Vui long chon lai :");
            m = sc.nextInt();
        }
            System.out.println();
            System.out.println("=======================================");
            if(m == 1)
                Class.seeList();
            if(m == 2)
                System.out.println("Chua cap nhat duoc");
            if(m == 3)
                Class.addClass();


       // } else
          //  menuclass = false;
        //return menuclass;
    }

}
