/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.allergyapi.api;

import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.allergyapi.Allergies;
import org.openmrs.module.allergyapi.Allergy;

/**
 * This service exposes module's core functionality. It is a Spring managed bean which is configured
 * in moduleApplicationContext.xml.
 * <p>
 * It can be accessed only via Context:<br>
 * <code>
 * Context.getService(AllergyService.class).someMethod();
 * </code>
 * 
 * @see org.openmrs.api.context.Context
 */
public interface PatientService extends OpenmrsService {
	
	/**
	 * Gets allergies for a given patient
	 * 
	 * @param patient the patient
	 * @return the allergies object
	 */
	Allergies getAllergies(Patient patient);
	
	/**
	 * Confirms that a patient does not have any known allergies
	 * 
	 * @param patient the patient
	 */
	void confirmNoKnownAllergies(Patient patient);
	
	/**
	 * Adds a new patient allergy
	 * 
	 * @param patient the patient
	 * @param allergy the allergy
	 */
	void addAllergy(Patient patient, Allergy allergy);
	
	/**
	 * Removes a patient allergy
	 * 
	 * @param patient the patient
	 * @param allergy the allergy
	 */
	void removeAllergy(Patient patient, Allergy allergy);
}