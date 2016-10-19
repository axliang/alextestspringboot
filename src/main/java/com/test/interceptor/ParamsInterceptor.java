package com.test.interceptor;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.test.domain.ParamBody;
import com.test.domain.ParamHead;
import com.test.util.RSAUtil;
import com.test.util.ResponseUtil;

/**
 * @Type ParamsInceptor.java
 * @Desc 
 * @author alex
 * @date 2016年9月29日 上午9:51:14
 * @version 
 */
@Service
public class ParamsInterceptor  implements HandlerInterceptor{

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
                                Exception arg3) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
                           ModelAndView arg3) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler)
            throws Exception {
        // TODO Auto-generated method stub
       ServletContext  ctx  = request.getServletContext();
       String cipherText = (String) request.getParameter("param");
       String serviceCode = (String) request.getParameter("serviceCode");
       
       if(serviceCode == null){
           JSONObject jsonObject = new JSONObject();
           jsonObject.put("code", "99");
           jsonObject.put("message", "failed");
           ResponseUtil.writeJsonResponse(jsonObject.toString(), response);
           return false;
       }
       
       String privateKey = "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";
       String plainText = RSAUtil.decrypt(cipherText, privateKey);
       JSONObject jsonObject = JSONObject.parseObject(plainText);
       
       ParamBody paramBody = new ParamBody();
       paramBody.setParamBodyMap(jsonObject);
       ctx.setAttribute("paramBody", paramBody);
       
       ParamHead paramHead = new ParamHead();
       ctx.setAttribute("paramHead", paramHead);
       ctx.setAttribute("serviceCode", serviceCode);
       return true;
    }

    
    
    
    
    
    
}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年9月29日 alex creat
 */