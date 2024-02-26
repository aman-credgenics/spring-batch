package com.credgenics.job.upload.step;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

@Slf4j
public class QueryWriter implements ItemWriter<JSONObject> {

    /**
     * Process the supplied data element. Will not be called with any null items in normal
     * operation.
     *
     * @param chunk of items to be written. Must not be {@code null}.
     * @throws Exception if there are errors. The framework will catch the exception and
     *                   convert or rethrow it as appropriate.
     */
    @Override
    public void write(Chunk<? extends JSONObject> chunk) throws Exception {
        log.info(String.valueOf(chunk));
    }
}
