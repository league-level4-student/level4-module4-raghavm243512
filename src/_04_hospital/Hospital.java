package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		doctors.add(d);
		
	}
	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}
	public void assignPatientsToDoctors() throws DoctorFullException {
		// TODO Auto-generated method stub
		int c = -1;
		for (int i =0;i<patients.size();i++) {
			if (i%3==0)
				c++;
			doctors.get(c).assignPatient(patients.get(i));
		}
	}

}
