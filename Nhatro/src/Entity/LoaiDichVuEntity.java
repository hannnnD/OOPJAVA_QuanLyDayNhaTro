package Entity;

public class LoaiDichVuEntity extends BangGiaDichVuEntity {
    private int soluong;

    public LoaiDichVuEntity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    // Constructor của lớp con
    public LoaiDichVuEntity(String madichvu, String tendichvu, int giatien, String maloaidichvu, String quycach, int soluong) {
        super.setMadichvu(madichvu);
        super.setTendichvu(tendichvu);
        super.setGiatien(giatien);
        super.setMaloaidichvu(maloaidichvu);
        super.setQuycach(quycach);
        this.soluong = soluong;
    }

    // Ghi đè phương thức abstract
    @Override
    public double thanhTien() {
        return this.getGiatien() * this.getSoluong();
    }
}
