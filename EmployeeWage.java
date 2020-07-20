
public class EmployeeWage {

		public static final int IS_ABSENT = 0;
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		
		private static String company;
		private static int workingHr;
		private static  int WAGE_PER_HOUR;
		private static int MAX_HR_IN_MONTH;
		private static int NUM_OF_WORKING_DAYS;
		
		  @SuppressWarnings("static-access")
		EmployeeWage(String company,int WAGE_PER_HOUR,int workingHr,int MAX_HR_IN_MONTH,int NUM_OF_WORKING_DAYS)
		 {
			  this.company=company;
			  this.WAGE_PER_HOUR=WAGE_PER_HOUR;
			  this.workingHr=workingHr;
			  this.MAX_HR_IN_MONTH=MAX_HR_IN_MONTH;
			  this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
		 }
		  public static void monthlyWage()
		  {
			 int empHrs=0;
			 int empWage=0;
			 int totalWorkingHrs = 0;
			 int totalWorkingDays = 0;
			 int totalWage=0;
		
		//computation
		while(totalWorkingHrs <= MAX_HR_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS)
		{
		
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random() * 10)%3;
			switch (empCheck)
			{
				case 0:
					empHrs=0;
					break;
				case 1:
					empHrs=4;
					break;
				case 2:
					empHrs=8;
					break;
			}
			
			totalWorkingHrs+=empHrs;
			empWage=empHrs*WAGE_PER_HOUR;
			totalWage+=empWage;
		}
		System.out.println("Monthly wage of employee of "+company+" is:"+totalWage);
		
	}
		@SuppressWarnings("static-access")
		public static void main(String[] args) {
			EmployeeWage company1 = new EmployeeWage("DMart", 20, 7, 100, 25);
			company1.monthlyWage();
			EmployeeWage company2 = new EmployeeWage("Reliance", 15, 8, 120, 30);
			company2.monthlyWage();
			EmployeeWage company3 = new EmployeeWage("Big basket", 25, 9, 130, 35);
			company3.monthlyWage();
		
		}
}

