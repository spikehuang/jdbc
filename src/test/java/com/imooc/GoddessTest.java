package com.imooc;

import com.imooc.controller.GoddessController;
import com.imooc.model.Goddess;

import java.sql.SQLException;
import java.util.List;

public class GoddessTest {
    public static void main(String[] args) throws SQLException {
        GoddessController controller = new GoddessController();
        List<Goddess> result = controller.query();
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getUserName() + " " + result.get(i).getAge());
        }
    }
}
