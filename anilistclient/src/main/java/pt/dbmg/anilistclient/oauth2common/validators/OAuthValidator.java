package pt.dbmg.anilistclient.oauth2common.validators;

import javax.servlet.http.HttpServletRequest;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;


public interface OAuthValidator {

    public void validateMethod(HttpServletRequest request) throws OAuthProblemException;

    public void validateContentType(HttpServletRequest request) throws OAuthProblemException;

    public void validateRequiredParameters(HttpServletRequest request) throws OAuthProblemException;

    public void validateOptionalParameters(HttpServletRequest request) throws OAuthProblemException;

    public void validateNotAllowedParameters(HttpServletRequest request) throws OAuthProblemException;

    public void performAllValidations(HttpServletRequest request) throws OAuthProblemException;

}
