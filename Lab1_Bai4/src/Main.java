public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(2 , 3);
        PhanSo ps2 = new PhanSo(3 , 4);
        PhanSo ps3 = new PhanSo(5 , 3);
        PhanSo ps4 = new PhanSo(2  , 3);
        PhanSo ps5 = new PhanSo(4 , 7);
        PhanSo ps6 = new PhanSo(5 , 9);
        ps1.TongPhanSo(ps2);
        ps1.truPhanSo(ps3);
        ps1.nhanPhanSo(ps2);
        ps1.chiaPhanSo(ps5);
        System.out.println();
        ps1.soSanh(ps2);
        ps1.soSanh(ps4);
        ps1.soSanh(ps3);
        ps1.soSanh(ps6);

        System.out.println(ps1.inFo());
        System.out.println(ps2.inFo());
        System.out.println(ps3.inFo());
        System.out.println(ps4.inFo());
        System.out.println(ps5.inFo());
        System.out.println(ps6.inFo());

    }
}
