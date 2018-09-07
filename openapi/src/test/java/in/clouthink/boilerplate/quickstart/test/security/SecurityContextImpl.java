package in.clouthink.boilerplate.quickstart.test.security;

import in.clouthink.boilerplate.quickstart.account.domain.model.User;
import in.clouthink.boilerplate.quickstart.account.exception.UserRequiredException;
import in.clouthink.boilerplate.quickstart.security.SecurityContext;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * The SecurityContext Spring Security Implementation for Test ENV.
 */
public class SecurityContextImpl implements SecurityContext {

    @Override
    public User currentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null) {
            Object principal = authentication.getPrincipal();
            if (principal instanceof org.springframework.security.core.userdetails.User) {
                User result = new User();
                result.setId("MOCKID");
                BeanUtils.copyProperties(principal, result);
                return result;
            }
        }

        return null;
    }

    @Override
    public User requireUser() {
        User user = currentUser();

        if (user == null) {
            throw new UserRequiredException();
        }

        return user;
    }

}
