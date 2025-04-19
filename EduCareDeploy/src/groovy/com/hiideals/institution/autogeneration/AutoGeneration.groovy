package com.hiideals.institution.autogeneration
import java.security.SecureRandom;
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student

/**
 * @author Uddha Umesh
 * @createdOn 22-Nov-2016
 *
 */
class AutoGeneration {
	 
	def userService
	public static void main(String[] args){
		println "generateSubmissionID "+generateID()
		//def UserService
	}

	/**
	 * Uddha Umesh
	 * @return
	 */
	public static String generateID(String insName) {
		Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
		int julianDate = localCalendar.get(Calendar.DAY_OF_YEAR);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		String dateFormat = String.format("%03d", julianDate);
		
		int months = Calendar.getInstance().get(Calendar.MONTH)+1;
		int todate = Calendar.getInstance().get(Calendar.DATE);
		
		//sequence number
		
		def instituite  = Instituite.findByName(insName)
		def c = Student.findAllByInstituite(instituite)//ByInstituite(instituite.id)//findByInstituite(instituite.id)
		def streg = null
		def regNo = null
		if(c.isEmpty()){
			streg = 01
			regNo = "0000"+streg
			}else{
			streg = c.size()+Integer.parseInt("1")
			if(streg>1 || streg<=9){
				regNo =  "0000"+streg
			}else if(streg>=10 || streg<=99){
			regNo = "000"+streg
			}else if(streg>=100 || streg<=999){
			regNo = "00"+streg
			}else if(streg>=1000 || streg<=9999){
			regNo = "0"+streg
			}else{
			regNo = streg
			}
			
			}
		
		//End sequence number
		String submissionId = months.toString()+todate.toString() + year +  regNo;//dateFormat + getUniqueNumber();
		return submissionId;
	}

	/**
	 * Uddha Umesh
	 * @return
	 */
	public static String getUniqueNumber() {

		Calendar lCDateTime = Calendar.getInstance();
		int hours = lCDateTime.get(Calendar.HOUR_OF_DAY);
		int minutes = lCDateTime.get(Calendar.MINUTE);
		int seconds = lCDateTime.get(Calendar.SECOND);
		int mseconds = lCDateTime.get(Calendar.MILLISECOND);
		String hoursVal = String.format("%02d", hours);
		String minutesVal = String.format("%02d", minutes);
		String secondsVal = String.format("%02d", seconds);
		String finalSeveDigitalVal =  hoursVal + minutesVal + secondsVal ;

		return finalSeveDigitalVal;
	}


	/**
	 * Uddha Umesh
	 * @param institutionName
	 * @return
	 */
	public static String getStudentRegId(String institutionName){
		def instituiteprefix  = Instituite.findByName(institutionName)
		if(institutionName !=null)
		//return RandomString.instance.splitString(institutionName)+generateID(institutionName)
		return instituiteprefix.institutionPrefixName+generateID(institutionName)
		else
			return RandomString.instance.generate(5)
	}

	/**
	 * Uddha Umesh
	 * @param admin
	 * @return
	 */
	public static String getInstitutionId(String admin){
		if(admin !=null)
			return RandomString.instance.splitString(admin)+RandomString.instance.generate(5)
		else
			return RandomString.instance.generate(5)
	}

	/**
	 * Uddha Umesh
	 * @param institutionName
	 * @return
	 */
	public static String getclassId(String institutionName){
		if(institutionName !=null)
			return RandomString.instance.splitString(institutionName)+RandomString.instance.generate(3)
		else
			return RandomString.instance.generate(3)
	}
}

