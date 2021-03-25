public class HinhChuNhat  extends Diem{
    Diem diemTrenTrai , diemDuoiPhai;

    public Diem getDiemTrenTrai() {
        return diemTrenTrai;
    }
    public HinhChuNhat() {

    }

    public void setDiemTrenTrai(String namet , float  xt , float yt)
    {
    this.name = namet;
    this.x = xt;
    this.y = yt;
    }

    public Diem getDiemDuoiPhai() {
        return diemDuoiPhai;
    }

    public void setDiemDuoiPhai(String namep , float  xp , float yp) {
        this.name = namep;
        this.x = xp;
        this.y = yp;
    }

    public HinhChuNhat(Diem diemTrenTrai, Diem diemDuoiPhai) {
        this.diemTrenTrai = diemTrenTrai;
        this.diemDuoiPhai = diemDuoiPhai;
    }
    /* public HinhChuNhat(String nameTT, float x1, float y1, String nameDP , float x2, float y2) {
        nameTT = nameTT;
        x1 = x1;
        y1= y1;
        nameDP = nameDP;
        x2 = x2;
        y2 = y2;

    }*/
    public String toString(){
        String s = "HCN co diem trai tren " + diemTrenTrai.getName() + "(" + diemTrenTrai.getX()
                + "," + diemTrenTrai.getY() + ") va diem phai duoi " + diemDuoiPhai.getName() +
                "(" + diemDuoiPhai.getX() + "," + diemDuoiPhai.getY() + ") co chu vi  va dien tich" +
                " lan luot la " ;

        return s;
    }
    public double chuVi(double a , double b){
        double answer = 0 ;
        answer = (a + b) * 2;
        return answer;
    }
    public double dienTich(double a , double b){
        double answer = 0 ;
        answer =  a * b ;
        return answer;
    }
   /* public Diem getDiemTrenPhai(){
        return  diemTrenPhai;
    }

    public Diem getDiemDuoiTrai(){
        return diemDuoiTrai;
    }
    public Diem diemTrenPhai , diemDuoiTrai;

    public void setDiemTrenPhai(Diem diemTrenTrai, Diem diemDuoiPhai) {
        this.x = diemTrenTrai.getX();
        this.y = diemDuoiPhai.getY();
    }
    public void setdiemDuoiTrai(Diem diemTrenTrai, Diem diemDuoiPhai) {
        this.x = diemDuoiPhai.getX();
        this.y = diemTrenTrai.getY();
    }*/
    public double chieuDai(Diem d1 , Diem d2){
        double result = 0;

        result = Math.sqrt((Math.pow((d1.getX() - d2.getX()),2)) + (Math.pow((d1.getY() - d2.getY()) , 2)));
        return  result;
    }
    public double chieuRong(Diem d1 , Diem d2){
        double result = 0;
        result = Math.sqrt((Math.pow((d1.getX() - d2.getX()),2)) + (Math.pow((d1.getY() - d2.getY()) , 2)));
        return  result;
    }

}
