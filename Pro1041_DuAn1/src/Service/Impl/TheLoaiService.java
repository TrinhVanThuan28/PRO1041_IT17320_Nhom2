/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Impl;

import DomainModel.TheLoai;
import Reponritory.Impl.TheLoaiReponsitory;
import Service.ITheLoaiService;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class TheLoaiService implements ITheLoaiService {

    private TheLoaiReponsitory theLoaiRepo;

    public TheLoaiService() {
        this.theLoaiRepo = new TheLoaiReponsitory();
    }

    @Override
    public ArrayList<TheLoai> getlist() {
        return this.theLoaiRepo.selectAll();
    }

    @Override
    public void them(TheLoai tl) {
        this.theLoaiRepo.them(tl);
    }

    @Override
    public void sua(TheLoai tl, String id) {
        this.theLoaiRepo.sua(tl, id);
    }

    @Override
    public void xoa(String id) {
        this.theLoaiRepo.xoa(id);
    }

    @Override
    public String checkTrungMa(String ma) {
        return this.theLoaiRepo.checkTrungMa(ma);
    }

}
