package com.bayu.first;

import org.springframework.web.bind.annotation.RestController;

import com.bayu.first.model.Mahasiswa;
import com.bayu.first.model.RowMapperMhs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MahasiswaController {
    @Autowired
    private JdbcTemplate koneksi;

    @GetMapping("/")
    public List<Mahasiswa> getAllMahasiswa() {
        String sql = "SELECT * FROM mhs";
        return koneksi.query(sql, new RowMapperMhs());
    }

    @PostMapping("/insert")
    public String inserMahasiswa(@RequestBody Mahasiswa data) {
        String hasil;
        System.out.println(data.getNim());
        String sql = "INSERT INTO mhs VALUES(?, ?, ?, ?)";
        try {
            koneksi.update(sql, data.getNim(), data.getNama(), data.getAlamat(), data.getPhoto());
            hasil = "berhasil memasukan data";
        } catch (Exception e) {
            hasil = "tidak dapat menambahkan data";
            System.out.println(e);
        }
        return hasil;
    }

    @PutMapping("/update")
    public String updateMahasiswa(@RequestBody Mahasiswa data) {
        String hasil;
        String nim = data.getNim();
        String sql = "UPDATE mhs SET c_nim = ?, n_nama = ?, n_alamat = ?, d_photo = ? WHERE c_nim =" + nim;
        try {
            koneksi.update(sql, data.getNim(), data.getNama(), data.getAlamat(), data.getPhoto());
            hasil = "berhasil mengubah data";
        } catch (Exception e) {
            hasil = "tidak dapat mengubah data";
            System.out.println(e);
        }
        return hasil;
    }
}
