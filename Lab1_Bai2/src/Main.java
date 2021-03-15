public class Main {
    public static void main(String[] args){
        Diem A = new Diem("A" , 4 ,5);
        Diem B = new Diem("B" , 5 ,4);
        DoanThang AB = new DoanThang("AB",A , B);

        System.out.println(AB.length(A,B));
        System.out.println(AB.diemTB(A , B));
        Diem C = new Diem("C" ,-6, 5);
        Diem D= new Diem("D" , -5,4);
        DoanThang CD = new DoanThang("CD",C , D);
        Diem E = new Diem("E",5 ,8);
        Diem F = new Diem("F",7 , 2);
        DoanThang.songSong(A, B , C , D);
        DoanThang.songSong(A, C , E ,F);
    }
}
