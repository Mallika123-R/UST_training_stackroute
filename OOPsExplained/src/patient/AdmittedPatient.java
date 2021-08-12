package patient;

public class AdmittedPatient implements Patient{
	
	public AdmittedPatient() {
		// parent constructor
	//	isAdmitted=true;
		System.out.println("AdmittedPatient");
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAdmitted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void admitPatient() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diagnosePatient(String issue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void treat(String treatment) {
		// TODO Auto-generated method stub
		
	}


	
	
}
