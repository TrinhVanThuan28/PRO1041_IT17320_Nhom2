/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author KIEN TRAN
 */
public class QuanAo {

    private String id;
    private String ma;
    private String ten;
    private float giaNhap;

    public QuanAo() {
    }

    public QuanAo(String id, String ma, String ten, float giaNhap) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.giaNhap = giaNhap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    @Override
    public String toString() {
        return ten;
    }

}
