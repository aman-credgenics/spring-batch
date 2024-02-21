package com.credgenics.job.upload.utils;

import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.springframework.batch.extensions.excel.RowMapper;
import org.springframework.batch.extensions.excel.support.rowset.RowSet;

@Slf4j
public class ExcelMapper implements RowMapper<JSONObject> {
    @Override
    public JSONObject mapRow(RowSet rowSet) throws Exception {
        JSONObject json =  new JSONObject();
        json.putAll(rowSet.getProperties());
        log.info("Row Read "+ json.toString());
        return json;
    }
}