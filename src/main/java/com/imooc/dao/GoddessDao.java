package com.imooc.dao;

import com.imooc.db.DbUtil;
import com.imooc.model.Goddess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GoddessDao {

    public void addGoddess() {

    }

    public void removeGoddess() {

    }

    public void updateGoddess() {

    }

    public List<Goddess> query() throws SQLException {
        Connection con =DbUtil.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT user_name,age FROM imooc_goddess ORDER BY age";
        ResultSet rs = null;

        if (sql.contains("limit")) {
            rs = stmt.executeQuery(sql);
        } else {
            StringBuffer buffer = new StringBuffer(sql);
            buffer.append(" limit 5");
            rs = stmt.executeQuery(buffer.toString());
        }

        List<Goddess> gs = new ArrayList<>();
        Goddess g = null;
        while (rs.next()) {
            g = new Goddess();
            g.setAge(rs.getInt("age"));
            g.setUserName(rs.getString("user_name"));
            gs.add(g);
        }
        return gs;
    }

    public Goddess get() {
        return null;
    }
}
