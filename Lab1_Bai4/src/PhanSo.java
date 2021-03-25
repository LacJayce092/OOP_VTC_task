public class PhanSo {
    private int tuSo , mauSo;
    public static PhanSo[] arr = new PhanSo[10];

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public static int ucln(PhanSo pt){
        int tuSo = pt.getTuSo();
        int mauSo = pt.getMauSo();
        if(tuSo == 0 || mauSo == 0){
            return tuSo + mauSo;
        }
        while (tuSo != mauSo){
            if(tuSo > mauSo){
                tuSo -= mauSo;
            }else{
                mauSo -= tuSo;
            }
        }
        return tuSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public PhanSo rutGon(PhanSo pt){
        int ts = pt.getTuSo() / ucln(pt);
        int ms = pt.getMauSo() / ucln(pt);
        return new PhanSo(ts , ms);
    }
    public void TongPhanSo(PhanSo ps){
        int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.rutGon(phanSoTong);
        System.out.println("Tổng hai phân số = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }
    public void truPhanSo(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.rutGon(phanSoHieu);
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
    }
    public void nhanPhanSo(PhanSo ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.rutGon(phanSoTich);
        System.out.println("Tích hai phân số = " + phanSoTich.tuSo + "/" + phanSoTich.mauSo);
    }
    public void chiaPhanSo(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo();
        int ms = this.getMauSo() * ps.getTuSo();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.rutGon(phanSoThuong);
        System.out.println("Thương hai phân số = " + phanSoThuong.tuSo + "/" + phanSoThuong.mauSo);
    }
    public void soSanh(PhanSo ps){
        double ps1 = this.getTuSo() / this.getMauSo();
        double ps2 = ps.getTuSo() / ps.getMauSo();
        if(ps1 > ps2){
            System.out.printf("Phan so %d/%d > Phan so %d/%d" , this.tuSo, this.mauSo,ps.getTuSo(),ps.getMauSo());
            System.out.println();
        }else if(ps1 < ps2){
            System.out.printf("Phan so %d/%d < Phan so %d/%d" , this.tuSo, this.mauSo,ps.getTuSo(),ps.getMauSo());
            System.out.println();
        }else {
            System.out.printf("Phan so %d/%d = Phan so %d/%d", this.tuSo, this.mauSo, ps.getTuSo(), ps.getMauSo());
            System.out.println();
        }

    }
    public String inFo(){
        String s = String.format(tuSo + "/" + mauSo);

        return s;
    }
}


