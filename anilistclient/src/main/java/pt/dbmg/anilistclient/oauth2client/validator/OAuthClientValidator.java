/**
 *       Copyright 2010 Newcastle University
 *           Maciej Machulak, Lukasz Moren
 *
 *          http://research.ncl.ac.uk/smart/
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package pt.dbmg.anilistclient.oauth2client.validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pt.dbmg.anilistclient.oauth2client.response.OAuthClientResponse;
import pt.dbmg.anilistclient.oauth2common.OAuth;
import pt.dbmg.anilistclient.oauth2common.error.OAuthError;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;
import pt.dbmg.anilistclient.oauth2common.utils.OAuthUtils;



public abstract class OAuthClientValidator {

    protected Map<String, String[]> requiredParams = new HashMap<String, String[]>();
    protected List<String> notAllowedParams = new ArrayList<String>();

    public void validate(OAuthClientResponse response) throws OAuthProblemException {
        validateErrorResponse(response);
        validateParameters(response);
    }

    public void validateParameters(OAuthClientResponse response) throws OAuthProblemException {
        validateRequiredParameters(response);
        validateNotAllowedParameters(response);
    }

    public void validateErrorResponse(OAuthClientResponse response) throws OAuthProblemException {
        String error = response.getParam(OAuthError.OAUTH_ERROR);
        if (!OAuthUtils.isEmpty(error)) {
            String errorDesc = response.getParam(OAuthError.OAUTH_ERROR_DESCRIPTION);
            String errorUri = response.getParam(OAuthError.OAUTH_ERROR_URI);
            String state = response.getParam(OAuth.OAUTH_STATE);
            throw OAuthProblemException.error(error).description(errorDesc).uri(errorUri).state(state);
        }
    }


    public void validateRequiredParameters(OAuthClientResponse response) throws OAuthProblemException {
        Set<String> missingParameters = new HashSet<String>();

        for (Map.Entry<String, String[]> requiredParam : requiredParams.entrySet()) {
            String paramName = requiredParam.getKey();
            String val = response.getParam(paramName);
            if (OAuthUtils.isEmpty(val)) {
                missingParameters.add(paramName);
            } else {
                String[] dependentParams = requiredParam.getValue();
                if (!OAuthUtils.hasEmptyValues(dependentParams)) {
                    for (String dependentParam : dependentParams) {
                        val = response.getParam(dependentParam);
                        if (OAuthUtils.isEmpty(val)) {
                            missingParameters.add(dependentParam);
                        }
                    }
                }
            }
        }

        if (!missingParameters.isEmpty()) {
            throw OAuthUtils.handleMissingParameters(missingParameters);
        }
    }

    public void validateNotAllowedParameters(OAuthClientResponse response) throws OAuthProblemException {
        List<String> notAllowedParameters = new ArrayList<String>();
        for (String requiredParam : notAllowedParams) {
            String val = response.getParam(requiredParam);
            if (!OAuthUtils.isEmpty(val)) {
                notAllowedParameters.add(requiredParam);
            }
        }
        if (!notAllowedParameters.isEmpty()) {
            throw OAuthUtils.handleNotAllowedParametersOAuthException(notAllowedParameters);
        }
    }


}
