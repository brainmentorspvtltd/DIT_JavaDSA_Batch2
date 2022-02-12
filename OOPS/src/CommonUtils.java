import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class CommonUtils {
	
	ResourceBundle rb = ResourceBundle.getBundle("constants");
//	Locale locale = new Locale("hi", "IN");
	Locale locale = new Locale(rb.getString("localeFormat"), rb.getString("localeCountry"));
	
	// Formatting of Name
	public String getProperName(String name) {
		/*
		 * name = "john CeNa"; 
		 * nameArr = ["john", "CeNa"];
		 */
		String nameArr[] = name.split(" ");
		String properName = "";
		for (String n : nameArr) {
			properName += String.valueOf(n.charAt(0)).toUpperCase() + 
					n.substring(1).toLowerCase() + " ";
		}
		return properName;
		
	}
	
	// Formatting of Salary in different currency
	public String formatSalary(double salary) {	
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formatSal = nf.format(salary);
		return formatSal;
	}
	
	// Formatting of Date
	public String formatDate() {
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		String formattedDate = df.format(date);
		return formattedDate;
	}

}
