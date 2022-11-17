/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.TheLoai;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface ITheLoaiService {

    ArrayList<TheLoai> getlist();

    void them(TheLoai tl);

    void sua(TheLoai tl, String id);

    void xoa(String id);

    String checkTrungMa(String ma);
}
