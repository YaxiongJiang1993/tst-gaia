package com.davih.tst.common.test.antr.hql;

import cn.hutool.core.util.StrUtil;
import com.davih.tst.common.test.antr.hql.code.HplsqlBaseListener;
import com.davih.tst.common.test.antr.hql.code.HplsqlParser;
import lombok.Data;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @Author Geene
 * @Date 2022/11/3 9:47
 */
@Data
public class QueryTableListener extends HplsqlBaseListener {

    private List<String> withTableNames = new ArrayList<>();

    @Override
    public void enterTable_name(HplsqlParser.Table_nameContext tctx) {
        if (tctx != null) {
            String table = tctx.getText();
            withTableNames.add(table);
        }
    }



}
