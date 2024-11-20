package com.davih.tst.common.test.antr.test.sql2;

import com.davih.tst.common.test.antr.test.sql2.gen.SqlLexer;
import com.davih.tst.common.test.antr.test.sql2.gen.SqlParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;
import java.util.Map;

public class DavTest {

    public static void main(String[] args) {
        String sql = "SELECT y.last_payment_time, y.uid, y.last_plan, y.rn " +
                "FROM ( " +
                "  SELECT x.*, row_number() OVER (PARTITION BY x.uid ORDER BY x.last_payment_time DESC) AS rn " +
                "  FROM ( " +
                "    SELECT account_id AS uid, current_payment_period AS last_plan, current_payment_time AS last_payment_time " +
                "    FROM dws.dws_vod_acct_model " +
                "    WHERE data_source = 'mfc' " +
                "    LIMIT 100 " +
                "    UNION " +
                "    SELECT uid, last_payment_period AS last_plan, last_payment_time " +
                "    FROM dws.dws_vod_device_user_model " +
                "    WHERE data_source = 'mfc' " +
                "    LIMIT 100 " +
                "  ) x " +
                ") y " +
                "LIMIT 1000;";

        SqlLexer lexer = new SqlLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);

        ParseTree tree = parser.root();
        SqlListener listener = new SqlListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        Map<String, List<String>> tableToColumns = listener.getTableToColumns();
        System.out.println("Tables and Columns: " + tableToColumns);

    }
}
