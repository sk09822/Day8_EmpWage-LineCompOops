package com.blz.empwage;

public class EmpComputation {

	public static final int IS_FULL_TIME = 1;
	public static final int SALARY_PER_HR = 20;
	public static final int IS_PART_TIME = 2;
	public static final int NO_OF_DAYS = 20;
	public static final int MAX_HR_IN_MONTH = 100;

	public static void employeeAttendace() {
		int Working_Hr = 0;
		int TotalEmpHrs = 0;
		int TotalEmpWorkingDay = 0;
		while (TotalEmpHrs <= MAX_HR_IN_MONTH && TotalEmpWorkingDay < NO_OF_DAYS) {
			TotalEmpWorkingDay++;
			int empCheck = (int) Math.floor((Math.random() * 10) % 3);

			switch (empCheck) {
			case IS_FULL_TIME:
				Working_Hr = 8;
				break;
			case IS_PART_TIME:
				Working_Hr = 4;
				break;
			default:
				Working_Hr = 0;
			}
			TotalEmpHrs += Working_Hr;
			System.out.println("Day :  " + TotalEmpWorkingDay + "   Emp Hr : " + Working_Hr);
		}
		int totalEmpWage = TotalEmpHrs * SALARY_PER_HR;

		System.out.println("Total Emp Wage : " + totalEmpWage);
	}

	public static void main(String[] args) {

		EmpComputation.employeeAttendace();
	}

}
