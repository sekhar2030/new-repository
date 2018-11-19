package com.example;
I changed something in sample.java

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SampleJava {
	
	public void foo(String s) {
		 System.out.println("String");
		 }
	private static final String FILENAME = "C:\\E\\filename.txt";

	public static void main(String src[])
	{
		


	/*Calendar gcal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM");
	Date start = null;
	try {
		start = sdf.parse("2010.01");
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Date end = null;
	try {
		end = sdf.parse("2010.04");
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	gcal.setTime(start);
	// Move the month back by one before we start...
	gcal.add(Calendar.MONTH, -1);
	while (gcal.getTime().before(end)) {
	    gcal.add(Calendar.MONTH, 1);
	    Date d = gcal.getTime();
	    System.out.println(d);
	}*/
		/*LocalDate start = LocalDate.parse("23.06.2016"),
	          end   = LocalDate.parse("2016-07-18");

	String sundayCounts="";
	int count=1;
	LocalDate next = start.minusDays(1);
	while ((next = next.plusDays(1)).isBefore(end.plusDays(1))) {
		
		  DateFormat format2=new SimpleDateFormat("EEEE"); 
	    System.out.println(next.getDayOfWeek()+" "+ count);
	    if(next.getDayOfWeek().toString().equals("SUNDAY"))
	    {
	    	sundayCounts+=count+",";
	    }
	  
	    count++;
	}
	  System.out.println(sundayCounts);*/
	
	/*Calendar c = Calendar.getInstance();    
	c.setTime(new Date());
	int dayOfWeek = c.getTime().getDay();
	System.out.println(c.get(Calendar.DAY_OF_WEEK));
	
	SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week abbreviated
    System.out.println(simpleDateformat.format(new Date()));
    
    String s = "[Hello World!]";
    s = s.substring(1, s.length() - 1);
    System.out.println(s);

    String value="123";
    int value1=1234;
    
    if(value1==Integer.valueOf(value))
    {
    	 System.out.println("True value");
    }
	
	
	for (int i=0; i<10;i++)
	{
		
		if(i==4)
		{
			break;
		}
		System.out.println("True value"+1);
	}*/
		
		String value="('1234','fere','ewefewggfewrt','ewerweqrewrew','erewrewrewrwe')";
		
        if(value.contains("("))
        	value = value.replaceAll("\\(","");
     if(value.contains(")"))
    	 value = value.replaceAll("\\)","");
     
     System.out.println("True value "+value);

     List<String> listValu3=new ArrayList<String>();
     listValu3.add("1234");
     listValu3.add("sekhar");
     listValu3.add("polo");
     
     String value1[]={"sekhar","sdasfdsa","sdsfdsf"};
     
     
     if(listValu3.contains(value1))
     {
    	 System.out.println("True value "+ true);

     }
     
     String loginToken=" [wdsd34svdf}]";
     
     loginToken=loginToken.trim().substring(1, loginToken.trim().length()-1);
     System.out.println(loginToken);
     
   
     
     String query=("Sekhar");
     System.out.println("query->"+query);
     
     String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");
		System.out.println(s1 = s2);
		
		new SampleJava().foo(null);
		
		String s1a = new String("abc");
		String s2b = new String("abc");
		System.out.println(s1a == s2b);
		
		String s1aa = "abc";
		String s2bb = "abc";
		System.out.println(s1aa == s2bb);

		String s1aaa = "abc";
		String s2bbb = new String("abc");
		s2bbb.intern();
		System.out.println(s1aaa ==s2bbb);
		
		 /* Date currDate = new Date();
		     DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		     String strCurrDate = dateFormat.format("26-huhtikuuta-2017");
		     System.out.println("strCurrDate->"+strCurrDate);
		     */
		    /* SimpleDateFormat dftFormat = new SimpleDateFormat("dd MM yyyy", new Locale("fi", "FI"));
		     try {
				Date datDate = dftFormat.parse("25 syyskuu 2012");
				
				System.out.println("strCurrDate->"+datDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     */
		     Map map=new HashMap<>();
		     map.put("Sekhar","sekhar");
		     map.put("polo","polo");
		     
		 	System.out.println(map.get("polo"));
		 	
		 	BufferedReader br = null;
			FileReader fr = null;

			try {

				/*fr = new FileReader(FILENAME);
				br = new BufferedReader(fr);*/

				String sCurrentLine;

				br = new BufferedReader(new FileReader(FILENAME));

				if ((sCurrentLine = br.readLine()) != null) {
					System.out.println(sCurrentLine);
				}
				
				File file = new File(FILENAME);
				FileInputStream fis = new FileInputStream(file);
				byte[] data = new byte[(int) file.length()];
				fis.read(data);
				fis.close();

				String str = new String(data, "UTF-8");
				System.out.println(str);

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (br != null)
						br.close();

					if (fr != null)
						fr.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}

			}
			
			Calendar cal = Calendar.getInstance();
	        cal.setTime(new Date());
	        cal.set(Calendar.HOUR_OF_DAY, 0);
	        cal.set(Calendar.MINUTE, 0);
	        cal.set(Calendar.SECOND, 0);
	        cal.set(Calendar.MILLISECOND, 0);
	        
	        Date curDate=cal.getTime();
	        
	       List<Date> dates = new ArrayList<Date>() ;
	       ArrayList<String> dateStringList = new ArrayList<String>();
	       ArrayList<Date> dateList = new ArrayList<Date>();

	       //dateStringList.add("2017-08-29");
	       dateStringList.add("2017-06-01");
	       dateStringList.add("2017-10-08");

	       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");

	       for (String dateString : dateStringList) {
	           try {
	               dateList.add(simpleDateFormat.parse(dateString));
	           } catch (ParseException e) {
	               e.printStackTrace();
	           }
	       }
	       long ret = 0;
	       for (Date date : dateList) {
	           System.out.println("Date " + simpleDateFormat.format(date));
	       }

	       for(Date d : dateList){
	    	    if(Math.abs(curDate.getTime() - ret) > Math.abs(curDate.getTime() - d.getTime())){
	    	        ret = d.getTime();
	    	    }
	    	}
	       System.out.println("Date nearest " +new Date(ret)); 
	       
	       List<Date> listDates = new ArrayList<Date>();
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	        
	       try {
	           listDates.add(dateFormatter.parse("2013-09-30"));
	           listDates.add(dateFormatter.parse("2013-07-06"));
	           listDates.add(dateFormatter.parse("2013-11-28"));
	       } catch (ParseException ex) {
	           System.err.print(ex);
	       }
	        
	       System.out.println("Before sorting: " + listDates);
	        
	       Collections.sort(listDates);
	        
	       System.out.println("After sorting: " + listDates);

	        	/* String value2=null;
	        	 
	        	   System.out.println("Value" + value2.replace("filed", ""));
	        	   */
	        	   String decimasl="11";
	        	   
	        	   System.out.println("decimasl Value" + Integer.valueOf(decimasl));
	        	 
	        	   BigDecimal  bd = new BigDecimal(decimasl);
                   bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
                   
                   System.out.println("decimasl Value" +bd);
                   
                   System.out.println("bd value: " +  bd.setScale(2, BigDecimal.ROUND_HALF_UP).stripTrailingZeros());
                   String s = "10.12";
                   System.out.println(s.replaceAll("[0]+$", "").replaceAll("(\\.)(?!.*?[1-9]+)", ""));
                   
                   Set set = new HashSet();
           		// adding elements to our set
           		set.add("Switzerland");
           		set.add("Land of Java Tutorial");
           		set.add("Array Example");

           		// Converting our set to Array
           		String[] arrayString = (String[]) set.toArray(new String[set.size()]);
           		for(String se: arrayString){
           			// printing the contents of our array
           			System.out.println(se);
           		}

String decisionMakers="Decision maker1, Decision maker2, Decision maker3, Decision maker4";

System.out.println("decisionMakers"+decisionMakers.split("#").length);

List<String> a = new ArrayList<String>();
a.add("kk");
a.add("pp");

if(a.contains("kk"))
	System.out.println("kk");

System.out.println("String Value to int value "+Integer.valueOf("006"));

Map map1=new HashMap();




map1.put("s1", "s1");
map1.put(new String("s1"), "s1");
System.out.println("String Value to int value "+map1.size());

int x=10;

int y=x-- - -x;
System.out.println("String Value to int value "+y);
System.out.println("String Value to int value "+ -x +" "+x--+ " "+ -x);

BigDecimal groups=new BigDecimal(10).divide(new BigDecimal(20));

System.out.println("group values "+groups);
double d = 4;
BigDecimal bd1 = new BigDecimal(( d - Math.floor( d )) * 100 );
bd1 = bd1.setScale(1);
System.out.println( "decimal value"+ bd1 );

String number = String.valueOf(d);
number = number.substring(number.indexOf(".")).substring(1);

System.out.println("group"+ number );

List valueList=null;

/*if(valueList.isEmpty())
{
    System.out.println("List values are");
}*/
String dateTime2=new Date().toString().replaceAll(":", "_");

System.out.println("List values are"+dateTime2);

int intq=0;

++intq;
System.out.println("List values are"+intq);
}
	
	
}
