package hospital;

import org.testng.annotations.Test;

import patient.AdmittedPatient;
import patient.NewPatient;
import patient.Patient;

public class Hospital {
	
	public static void main(String[] arg) {
		Hospital h = new Hospital();
		Patient p = h.treatPatient("heart");
		if(p instanceof NewPatient) {
			//
		}else if(p instanceof AdmittedPatient) {
			//
		}
		
		// how do i get know - what p is
		System.out.println(p instanceof NewPatient);
		System.out.println(p instanceof AdmittedPatient);
	}
	
	public Patient treatPatient(String symptom) {
		// symptom - fever - no need admit
		Patient p =null;
		if(symptom.equals("fever")) {
			// no admit
			p = new NewPatient();
			System.out.println(p.getId());
			System.out.println(p.isAdmitted());
			
		}else {
			// admit
			System.out.println("-----------------");
			p = new AdmittedPatient();// id, isAdmitted=false
			p.admitPatient();
			System.out.println(p.getId());
			System.out.println(p.isAdmitted());
			
		}
		
		return p;
		// NewPatient , AdmittedPatient
		
	}

}
