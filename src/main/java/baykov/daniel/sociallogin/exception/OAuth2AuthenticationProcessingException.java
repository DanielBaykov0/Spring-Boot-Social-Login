package baykov.daniel.sociallogin.exception;

import javax.naming.AuthenticationException;

public class OAuth2AuthenticationProcessingException extends AuthenticationException {

    public OAuth2AuthenticationProcessingException(String explanation) {
        super(explanation);
    }
}
