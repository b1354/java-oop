package com.bayu.first.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperMhs implements RowMapper<Mahasiswa> {

    @Override
    public Mahasiswa mapRow(ResultSet arg0, int arg1) throws SQLException {
        
        return null;
    }   
}
