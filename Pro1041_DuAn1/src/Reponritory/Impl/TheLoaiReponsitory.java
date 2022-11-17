/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reponritory.Impl;

import DomainModel.TheLoai;
import Reponritory.ITheLoaiReponsitory;
import Utilities.Dbcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class TheLoaiReponsitory implements ITheLoaiReponsitory {

    @Override
    public ArrayList<TheLoai> selectAll() {
        ArrayList<TheLoai> list = new ArrayList<>();
        try {
            Connection conn = Utilities.Dbcontext.getConnection();
            String sql = "SELECT * FROM TheLoai";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String maTL = rs.getString("MaTL");
                String loaiCo = rs.getString("LoaiCo");
                String loaiAo = rs.getString("LoaiAo");
                String luaTuoi = rs.getString("LuaTuoi");
                TheLoai tl = new TheLoai(id, maTL, loaiCo, loaiAo, luaTuoi);
                list.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void them(TheLoai tl) {
        try {
            Connection conn = Dbcontext.getConnection();
            String sql = "insert into TheLoai(MaTL, LoaiCo, LoaiAo, LuaTuoi ) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, tl.getMaTL());
            ps.setString(2, tl.getLoaiCo());
            ps.setString(3, tl.getLoaiAo());
            ps.setString(4, tl.getLuaTuoi());

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sua(TheLoai tl, String id) {
        try {
            Connection conn = Dbcontext.getConnection();
            String sql = "update TheLoai  set LoaiCo = ? , LoaiAo = ?, LuaTuoi = ? where id =?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, tl.getLoaiCo());
            ps.setString(2, tl.getLoaiAo());
            ps.setString(3, tl.getLuaTuoi());
            ps.setString(4, id);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void xoa(String id) {
        try {
            Connection conn = Dbcontext.getConnection();
            String sql = "delete from TheLoai where id =?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, id);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String checkTrungMa(String ma) {
String maSearch = null;
        try {
            Connection conn = Utilities.Dbcontext.getConnection();
            String sql = "Select MaTL from TheLoai where MaTL = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String maTL = rs.getString("MaTL");

                maSearch = ma;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maSearch;
    }    

}
