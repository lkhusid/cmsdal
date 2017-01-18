/*******************************************************************************
 *  
 *   Copyright 2015 Walmart, Inc.
 *  
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  
 *******************************************************************************/
package com.oneops.cms.util;

import com.oneops.cms.md.domain.CmsClazz;
import com.oneops.cms.md.domain.CmsRelation;
import com.oneops.cms.md.service.CmsMdManager;

/**
 * The Class CmsMdValidator.
 */
public class CmsMdValidator {


    /**
     * Validate update clazz.
     *
     * @param clazz the clazz
     * @return the cI validation result
     */
    public CIValidationResult validateUpdateClazz(CmsClazz clazz) {
        CIValidationResult result = new CIValidationResult();
        result.setValidated(true);
        //empty validation still
        return result;
    }


    /**
     * Validate update relation.
     *
     * @param relation the relation
     * @return the cI validation result
     */
    public CIValidationResult validateUpdateRelation(CmsRelation relation) {
        CIValidationResult result = new CIValidationResult();
        result.setValidated(true);
        //empty validation still
        return result;
    }

}
