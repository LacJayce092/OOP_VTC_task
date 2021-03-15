import java.util.Random;

public class DoanThang {
    Diem diem;
    String name;


    public Diem getDiem() {
        return diem;
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DoanThang() {
    }

    public DoanThang(String name ,Diem diem, Diem diem2) {
        this.name = name;
        this.diem = diem;
        this.diem = diem2;
    }
    public Diem diemTB(Diem diem,Diem diem2){
        Diem diemtb = new Diem("I",(diem.x + diem2.x)/2 , (diem.y + diem2.y)/2 );
        return diemtb;
    }
    public double length(Diem diem, Diem diem2){
        double result  = 0;
        result = Math.sqrt((Math.pow((diem.x - diem2.x),2)) + (Math.pow((diem.y - diem2.y) , 2)));
        String answer = String.valueOf(String.format("%.2f", result));
        return Double.parseDouble(answer);
    }
    public String toString(Diem diem, Diem diem2){
        return diem.name + diem2.name + "[(" + diem.x + "," + diem.y + ")]"
                +"," + "[(" + diem.y + "," + diem2.y + ")]";
    }

    public static void songSong(Diem diemA, Diem diemB,Diem diemC,Diem diemD){
        boolean answer = false;
        if((diemA.x - diemB.x) / (diemA.y - diemB.y) ==
                (diemC.x - diemD.x) / (diemC.y - diemD.y)){
            answer = true;
        }else
            answer = false;
        if(answer == true)
            System.out.printf("Hai doan thang song song");
        if(answer == false)
            System.out.printf("Hai doan thang ko song song");
        System.out.println();
    }
}

