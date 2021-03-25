public class Main {
    public static void main(String[] args){
        HinhChuNhat abcd = new HinhChuNhat();
        Diem o = new Diem();
        Diem traiTren = new Diem("A" , -4 , -5);
        Diem phaiDuoi = new Diem("C" , 0 ,0 );
        Diem phaiTren = new Diem("B" , traiTren.getX(), phaiDuoi.getY());
        Diem traiDuoi = new Diem("D" , phaiDuoi.getX(), traiTren.getY());
      //  abcd.chieuRong(traiTren, phaiTren);
       // abcd.chieuDai(traiDuoi,phaiDuoi);
         double chuvi = abcd.chuVi(abcd.chieuRong(traiTren, phaiTren) , abcd.chieuDai(traiDuoi,phaiDuoi));
        double dientich = abcd.dienTich(abcd.chieuRong(traiTren, phaiTren) , abcd.chieuDai(traiDuoi,phaiDuoi));
        abcd = new HinhChuNhat(traiTren , phaiDuoi);
        System.out.print(abcd);
        System.out.printf(" %.2f va %.2f", chuvi , dientich );
    }
}
