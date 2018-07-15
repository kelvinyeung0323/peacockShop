package com.peacock.shop.web.common;

import com.peacock.shop.web.exception.PeacockException;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by Kelvin Yeung on 2018/7/10.
 */
@Component
public class FreemarkerURLEncoder implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        if (null == arguments || arguments.size() < 1 || arguments.size() > 2) {
            throw new PeacockException("arguments number incorrect.expect 1 or 2.");
        }
        if (null == arguments.get(0)) {
            throw new PeacockException("the first argument is incorrect.");
        }

        String url = arguments.get(0).toString();
        String charset = "UTF-8";
        if (arguments.size() == 2) {
            charset =  arguments.get(1).toString();
        }
        String encodedUrl = url;
        try {
            encodedUrl = URLEncoder.encode(url, charset);
        } catch (UnsupportedEncodingException e) {
            //e.printStackTrace();
            return "";
        }
        return encodedUrl;
    }
}
