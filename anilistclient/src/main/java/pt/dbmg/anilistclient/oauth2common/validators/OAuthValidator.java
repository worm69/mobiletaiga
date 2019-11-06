package pt.dbmg.anilistclient.oauth2common.validators;

import javax.servlet.http.HttpServletRequest;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;


public interface OAuthValidator {

    void validateMethod(HttpServletRequest request) throws OAuthProblemException;

    void validateContentType(HttpServletRequest request) throws OAuthProblemException;

    void validateRequiredParameters(HttpServletRequest request) throws OAuthProblemException;

    void validateOptionalParameters(HttpServletRequest request) throws OAuthProblemException;

    void validateNotAllowedParameters(HttpServletRequest request) throws OAuthProblemException;

    void performAllValidations(HttpServletRequest request) throws OAuthProblemException;

}
