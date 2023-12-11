package com.nguyentanlap.myapplication.classdata;

public class DiaDiem {
    private String ddiem;
    private String vitri;
    private double diem;
    private String anh;
    private String  gioiThieu;
    private String anh_p1;
    private String anh_p2;
    private String anh_p3;

    public DiaDiem(String ddiem, String vitri, double diem, String anh, String gioiThieu, String anh_p1, String anh_p2, String anh_p3) {
        this.ddiem = ddiem;
        this.vitri = vitri;
        this.diem = diem;
        this.anh = anh;
        this.gioiThieu = gioiThieu;
        this.anh_p1 = anh_p1;
        this.anh_p2 = anh_p2;
        this.anh_p3 = anh_p3;
    }

    public String getDdiem() {
        return ddiem;
    }

    public void setDdiem(String ddiem) {
        this.ddiem = ddiem;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public String getAnh_p1() {
        return anh_p1;
    }

    public void setAnh_p1(String anh_p1) {
        this.anh_p1 = anh_p1;
    }

    public String getAnh_p2() {
        return anh_p2;
    }

    public void setAnh_p2(String anh_p2) {
        this.anh_p2 = anh_p2;
    }

    public String getAnh_p3() {
        return anh_p3;
    }

    public void setAnh_p3(String anh_p3) {
        this.anh_p3 = anh_p3;
    }
}
