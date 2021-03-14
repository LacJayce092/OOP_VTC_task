public class Main {
    public static void main(String[] args){
        Diem A = new Diem("A" , 4 ,5);
        Diem B = new Diem("B" , 5 ,4);
        DoanThang AB = new DoanThang(A , B);

        System.out.println(AB.length(A,B));
        System.out.println(AB.diemTB(A , B));
        Diem C = new Diem("C" ,-6, 5);
        Diem D new Diem("D" , -5,4);
        DoanThang CD = new DoanThang(C , D);
    }
}
