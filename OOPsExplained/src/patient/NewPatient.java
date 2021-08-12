package patient;

import java.util.Random;

public  class NewPatient implements Patient{
	
	public int id;
	public String diagnose;
	public String treatment;
	public boolean isAdmitted;
	
	public NewPatient() {
		System.out.println("NewPatient");
		id = new Random().nextInt(100);//0-99
		isAdmitted=false;//default
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean isAdmitted() {
		// TODO Auto-generated method stub
		return isAdmitted;
	}
		
	@Override
	public void admitPatient() {
		// blank
	}
	
	public void diagnosePatient(String issue) {
		
	}
	public void treat(String treatment) {
		
	}

	

}
