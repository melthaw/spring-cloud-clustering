package in.clouthink.springcloudclustering.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(produces = "application/json")
public class RoutingRestController {

    @Value("#{environment.EUREKA_INSTANCE_HOST}")
    private String hostname;

    @GetMapping("/routing")
    public String getRouting(HttpServletRequest request) {
        String zuulHostname = request.getHeader("X-Zuul-Hostname");
        return String.format("Routing Zuul[%s] to MicroService[%s]",zuulHostname, hostname);
    }

}
