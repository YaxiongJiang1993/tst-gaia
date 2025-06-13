package com.davih.tst.web.test.hive;

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;

public class HiveTest {
    private static final String JDBC_URL = "jdbc:hive2://51.81.244.225:11000";
    private static final String USER = "valor"; // 默认用户名
    private static final String PASSWORD = "";  // 如果 Hive 没有开启认证，留空

    public static void main(String[] args) {
        try {
            // 1. 加载 Hive JDBC 驱动（Hive 2.x 及以上可省略）
            Class.forName("org.apache.hive.jdbc.HiveDriver");

            // 2. 连接 Hive
            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("✅ 连接成功！");

            // 3. 执行 SQL 查询
            Statement statement = connection.createStatement();
            String sql = "Select count(continuous_incre_id) as count,\n" +
                    "       min(continuous_incre_id)   as minId,\n" +
                    "       max(continuous_incre_id)   as maxId,\n" +
                    "       sum(column1)                  column1_sum,\n" +
                    "       sum(column2)                  column2_sum\n" +
                    "from tmp.tmp_receive_verify\n" +
                    "where batch_no = '035'"; // 替换 your_table_name 为真实表名
            ResultSet resultSet = statement.executeQuery(sql);

            // 4. 解析查询结果
            while (resultSet.next()) {
                System.out.println("数据行：" + resultSet.getString(1)); // 根据列索引获取数据
            }

            // 5. 关闭连接
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("✅ 查询完成，连接关闭！");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ Hive JDBC 驱动未找到：" + e.getMessage());
        } catch (SQLException e) {
            System.err.println("❌ SQL 执行失败：" + e.getMessage());
        }
    }
}

