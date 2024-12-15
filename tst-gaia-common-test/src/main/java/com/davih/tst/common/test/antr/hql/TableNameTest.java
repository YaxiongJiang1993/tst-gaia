package com.davih.tst.common.test.antr.hql;

import com.davih.tst.common.test.antr.hql.code.HplsqlLexer;
import com.davih.tst.common.test.antr.hql.code.HplsqlParser;
import com.google.common.collect.Maps;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;
import java.util.Map;

public class TableNameTest {

    public static void main(String[] args) {

        String sql = "select from_unixtime(cast(cast(action_time as bigint) / 1000 as int), 'yyyy-MM-dd HH:mm:ss') `date`,\n" +
                "       mac,\n" +
                "       account_name,\n" +
                "       player_type,\n" +
                "       channel_name,\n" +
                "       bandwidth_average,\n" +
                "       ver_code,\n" +
                "       playback_duration,\n" +
                "       server_id,\n" +
                "       preset_custom_ip\n" +
                "from ods_live.ods_pb_live_r_playing\n" +
                "where mac = '00ea239153aa'\n" +
                "  and dt = '20231210'\n" +
                "order by action_time desc\n" +
                "limit 1000";
        for (int i = 0; i < 5; i++) {
            System.out.println("=========================" + i + "============================");
            List<String> tables = getTable(sql);
            System.out.println(tables);
        }

    }

    private static List<String> getTable(String sql) {
        CodePointCharStream stream = CharStreams.fromString(sql);
        HplsqlLexer lexer = new HplsqlLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HplsqlParser parser = new HplsqlParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        QueryTableListener queryListener = new QueryTableListener();
        walker.walk(queryListener, parser.program());
        List<String> tables = queryListener.getWithTableNames();
        return tables;
    }

}
