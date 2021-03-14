public class Main {
    public static void main(String[]args){
        Diem A = new Diem("A" , 4 ,5);
        Diem B = new Diem("B", 5 ,4);

        System.out.println(A.toString());
        System.out.println(B.toString());
        A.distance(B);
        System.out.println(A.distance(B));
    }
}
