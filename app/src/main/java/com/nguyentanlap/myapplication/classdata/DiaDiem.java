package com.nguyentanlap.myapplication.classdata;

public class DiaDiem {
    private String ddiem;
    private String vitri;
    private double diem;
    private String anh;

    public DiaDiem(String ddiem, String vitri, double diem, String anh) {
        this.ddiem = ddiem;
        this.vitri = vitri;
        this.diem = diem;
        this.anh = anh;
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
}
