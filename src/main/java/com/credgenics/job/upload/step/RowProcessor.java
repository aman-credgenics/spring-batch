package com.credgenics.job.upload.step;

import com.credgenics.job.upload.service.ExternalServiceCall;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.HashMap;

@Slf4j
public class RowProcessor implements ItemProcessor<JSONObject, JSONObject> {
    /**
     * Process the provided item, returning a potentially modified or new item for
     * continued processing. If the returned result is {@code null}, it is assumed that
     * processing of the item should not continue.
     * <p>
     * A {@code null} item will never reach this method because the only possible sources
     * are:
     * <ul>
     * <li>an {@link ItemReader} (which indicates no more items)</li>
     * <li>a previous {@link ItemProcessor} in a composite processor (which indicates a
     * filtered item)</li>
     * </ul>
     *
     * @param item to be processed, never {@code null}.
     * @return potentially modified or new item for continued processing, {@code null} if
     * processing of the provided item should not continue.
     * @throws Exception thrown if exception occurs during processing.
     */
    private final JdbcTemplate jdbcTemplate;
    private final ExternalServiceCall session;

    @Value("${server.job.companyId}")
    String companyId;

    public RowProcessor(JdbcTemplate jdbcTemplate, ExternalServiceCall session) {
        this.jdbcTemplate = jdbcTemplate;
        this.session = session;
    }

    @Override
    public JSONObject process(JSONObject item) throws Exception {

        HashMap<String, Object> validatedLoan = session.validateRow("e0bb14b2-4ce1-443f-bbe4-c2854850c6e5", item);
        log.info("Row process" + validatedLoan.toString());
        return item;
    }
}
