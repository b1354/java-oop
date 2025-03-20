package com.bayu.first.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

public class RowMapperMhs implements RowMapper<Mahasiswa> {

    @Override
    @Nullable
    public Mahasiswa mapRow(ResultSet rs, int rowNum) throws SQLException {
        Mahasiswa mhs = new Mahasiswa(rs.getString("c_nim"), rs.getString("n_nama"), rs.getString("n_alamat"), rs.getString("d_photo"));
        return mhs;
    }   
}
