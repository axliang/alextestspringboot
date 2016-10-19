package com.huawei.aep.sdk.common.model;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.huawei.aep.sdk.common.model.HttpResponse;

public class MobileReponse extends HttpResponse {

    /** The result. */
    private Result result;

    /**
     * Gets the result.
     * 
     * @return the result
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the result.
     * 
     * @param result the new result
     */
    public void setResult(Result result) {
        this.result = result;
    }

    /**
     * Parses the response.
     * 
     * @return the send SMS response
     * {@inheritDoc}
     */

    @Override
    public MobileReponse parse() {
        if (!StringUtils.isEmpty(getRspContent())) {
            JSONObject json = getJsonModelFromByte(getRspContent().getBytes());
            this.result = new Result();
            result.setResultCode(
                    json.containsKey("code") ? json.getString("code") : StringUtils.EMPTY);
            result.setResultMessage(json.containsKey("description") ? json.getString("description")
                    : StringUtils.EMPTY);
            result.setResult(
                    json.containsKey("result") ? json.getString("result") : StringUtils.EMPTY);
        }
        return this;
    }

}
