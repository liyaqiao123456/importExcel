package com.neo.excelmapper;

import com.neo.entity.Tbagent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface ExcelMapper {

    /**
     * 批量导入数据
     * @param tbagentList
     */
    void batchInsert(List<Tbagent> tbagentList);
}
