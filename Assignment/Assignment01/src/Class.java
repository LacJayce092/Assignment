import java.util.Scanner;

public class Class {
    public static Scanner sc = new Scanner(System.in);
   public static Class[] arr = new Class[30];
    public boolean isEmpty(Class arr[]){
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                result = true;
                break;
            }else
                result = false;
        }
        return  result;
    }
    static String maLop;
    static String moTa;
    static String teacher;
    static String time;
    static String dateLearn;

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDateLearn() {
        return dateLearn;
    }

    public void setDateLearn(String dateLearn) {
        this.dateLearn = dateLearn;
    }

    public Class() {
    }

    public Class(String maLop, String moTa, String teacher, String time, String dateLearn) {
        this.maLop = maLop;
        this.moTa = moTa;
        this.teacher = teacher;
        this.time = time;
        this.dateLearn = dateLearn;
    }
    public static void seeList(){
        System.out.printf(String.format("%-15s %-30s  %-25s  %-25s %-20s ",
                "MA LOP" , "MO TA" , "GIAO VIEN", "THOI GIAN HOC" ,"NGAY HOC)"));
        System.out.printf(String.format("%-15s %-30s  %-25s  %-25s %-20s ",
                maLop , moTa , teacher, time ,dateLearn));
    }
    public void updated(){
        System.out.println("===== Cap nhat thong tin lop =====");
    }
    public static void addClass(){
        System.out.print("Ma Lop : ");
        String s1 = sc.nextLine();
        System.out.print("Mo ta lop : : ");
        String s2 = sc.nextLine();
        System.out.print("Giang vien : ");
        String s3 = sc.nextLine();
        System.out.print("Gio hoc : ");
        String s4 = sc.nextLine();
        System.out.print("Ngay hoc : ");
        String s5 = sc.nextLine();
        Class c1 = new Class(s1 , s2 , s3 ,s4, s5);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                arr[i] = c1;
                break;
            }
        }
    }


}
