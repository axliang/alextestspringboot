package com.test.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.constants.Constants;
import com.test.domain.ParamBody;
import com.test.domain.ParamHead;
import com.test.domain.Response;
import com.test.service.OpenService;

/**
 * @Type HttpClientRsaController.java
 * @Desc 
 * @author alex
 * @date 2016年9月26日 上午9:58:39
 * @version 
 */

@RestController
@RequestMapping(value = "/httpClient")
public class HttpClientRsaController {
    
    private final static Logger logger = LoggerFactory.getLogger(HttpClientRsaController.class);

    @Autowired
    private ApplicationContext context;

    @RequestMapping(value = "/query1",method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Response doRequest(HttpServletRequest request) {
        ServletContext ctx = request.getServletContext();
        ParamBody paramBody = (ParamBody) ctx.getAttribute("paramBody");
        ParamHead paramHead = (ParamHead) ctx.getAttribute("paramHead");
        String serviceCode = (String) ctx.getAttribute("serviceCode");
        
        OpenService service = null;
        try {
            service = context.getBean(serviceCode, OpenService.class);
        } catch (Exception e) {
            logger.error(Constants.SERVICE_LOAD_FAILED, e);
        }
        if (service == null) {
            Response response = new Response();
            response.setSuccessSign(false);
            response.setErrorMessage(Constants.SERVICE_LOAD_FAILED);
            return response;
        }

        return service.invoke(paramHead, paramBody);
    }
    
    
    @RequestMapping(value = "/query2",method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Response doRequest2(HttpServletRequest request) {
        ServletContext ctx = request.getServletContext();
        ParamBody paramBody = (ParamBody) ctx.getAttribute("paramBody");
        ParamHead paramHead = (ParamHead) ctx.getAttribute("paramHead");
        String serviceCode = (String) ctx.getAttribute("serviceCode");
        
        OpenService service = null;
        try {
            service = context.getBean(serviceCode, OpenService.class);
        } catch (Exception e) {
            logger.error(Constants.SERVICE_LOAD_FAILED, e);
        }
        if (service == null) {
            Response response = new Response();
            response.setSuccessSign(false);
            response.setErrorMessage(Constants.SERVICE_LOAD_FAILED);
            return response;
        }

        return service.invoke(paramHead, paramBody);
    }
    
    
    

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年9月26日 alex creat
 */