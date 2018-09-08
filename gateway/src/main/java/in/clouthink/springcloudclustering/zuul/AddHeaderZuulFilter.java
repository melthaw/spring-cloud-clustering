package in.clouthink.springcloudclustering.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @auther tundra-dz
 */
@Component
public class AddHeaderZuulFilter extends ZuulFilter {

    @Value("#{environment.EUREKA_INSTANCE_HOST}")
    private String hostname;

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        try {
            RequestContext.getCurrentContext()
                          .addZuulRequestHeader("X-Zuul-Hostname", URLEncoder.encode(hostname, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
        }
        return null;
    }

}
