package homeWork1;

public class BirthDay {
	private int year;
	private int month;
	private int day;
	
	private boolean yearcheck;
	private boolean monthcheck;
	private boolean daycheck;
	
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setDay(int day){
		this.day=day;
	}
	public  void setDate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public BirthDay(){
		
	}
	public  BirthDay(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public boolean checkValidate(){
		if((year % 100 != 0) && (year % 4== 0) || year % 400 == 0)
			yearcheck=true;
		
		if(month>0&&month<=12)
			monthcheck=true;
		
		if(day>0){
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
				if(day<=31)
					daycheck=true;
			}else if(month==4||month==6||month==9||month==11){
				if(day<=30)
					daycheck=true;
			}else if(month==2){
				if(yearcheck&&day<=29){
					daycheck=true;
				}else if(day<=28){
					daycheck=true;
				}
			}else{
				daycheck=false;
			}
			
		}
		if(daycheck&&monthcheck)
			return true;
		else
			return false;
	}

}
