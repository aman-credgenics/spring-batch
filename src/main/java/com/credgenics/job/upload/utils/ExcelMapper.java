package com.credgenics.job.upload.utils;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.batch.extensions.excel.RowMapper;
import org.springframework.batch.extensions.excel.support.rowset.RowSet;

import java.util.Properties;

@Slf4j
public class ExcelMapper implements RowMapper<JSONObject> {
    @Override
    public JSONObject mapRow(RowSet rowSet) throws Exception {
        JSONObject json =  new JSONObject();
        Properties properties = rowSet.getProperties();
        for (String propertyName : properties.stringPropertyNames()) {
            String propertyValue = properties.getProperty(propertyName);
            json.put(propertyName, propertyValue);
        }
        log.info("Row Read "+ json.toString());
        return json;
    }
}