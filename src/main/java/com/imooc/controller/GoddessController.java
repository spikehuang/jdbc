package com.imooc.controller;

import com.imooc.dao.GoddessDao;
import com.imooc.model.Goddess;

import java.sql.SQLException;
import java.util.List;

public class GoddessController {

    public List<Goddess> query() throws SQLException {
        GoddessDao dao = new GoddessDao();
        return dao.query();
    }
}
