/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author ADMIN
 */
public class TheLoai {
    private String id;
    private String maTL;
    private String loaiCo;
    private String loaiAo;
    private String LuaTuoi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getLoaiCo() {
        return loaiCo;
    }

    public void setLoaiCo(String loaiCo) {
        this.loaiCo = loaiCo;
    }

    public String getLoaiAo() {
        return loaiAo;
    }

    public void setLoaiAo(String loaiAo) {
        this.loaiAo = loaiAo;
    }

    public String getLuaTuoi() {
        return LuaTuoi;
    }

    public void setLuaTuoi(String LuaTuoi) {
        this.LuaTuoi = LuaTuoi;
    }

    public TheLoai(String id, String maTL, String loaiCo, String loaiAo, String LuaTuoi) {
        this.id = id;
        this.maTL = maTL;
        this.loaiCo = loaiCo;
        this.loaiAo = loaiAo;
        this.LuaTuoi = LuaTuoi;
    }

    public TheLoai() {
    }
    
}
