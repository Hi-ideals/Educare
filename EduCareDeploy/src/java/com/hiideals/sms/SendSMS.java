package com.hiideals.sms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


public class SendSMS {
	public SendSMS() {
	}

	public static void sendSMS(String number,String message) throws IOException{
		String postData="";
		String retval ="";
		//give all Parameters In String
		String Username ="vidyashreemps";
		String Password ="vidyashree";
		String MobileNo = number;
		String Message = message;
		String SenderID = "VIDMPS";
		postData += "user=" + Username + "&pass=" + Password + "&phone=" + MobileNo +"&sender=" + SenderID + "&text=" + Message + "&priority=ndnd" + "&stype=normal";
		BufferedReader in;
		URL url = new URL("http://smst.newinbidar.com/api/sendmsg.php?user="+Username+"&pass="+Password+"&sender=VIDMPS&phone="+MobileNo+"&text=Test&priority=ndnd&stype=normal");
		HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
		urlconnection.setRequestMethod("POST");
		urlconnection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
		urlconnection.setDoOutput(true);
		OutputStreamWriter out = new OutputStreamWriter(urlconnection.getOutputStream());
		out.write(postData);
		out.close();
		in = new BufferedReader( new
				InputStreamReader(urlconnection.getInputStream()));
		String decodedString;
		while ((decodedString = in.readLine()) != null) {
			retval += decodedString;

		}
		System.out.println(retval);
		in.close();
	}

/*
	public static void sendSMSDynamic( String number,String message,String Username,String Password,String SenderID) throws IOException{
		String postData="";
		String retval ="";
		//give all Parameters In String
		String MobileNo = number;
		String Message = message;
		postData += "user=" + Username + "&pass=" + Password + "&phone=" + MobileNo +"&sender=" + SenderID + "&text=" + Message + "&priority=ndnd" + "&stype=normal";

		BufferedReader in;

		URL url = new URL("http://smst.newinbidar.com/api/sendmsg.php?user="+Username+"&pass="+Password+"&sender=BECHOB&phone="+MobileNo+"&text=Test&priority=ndnd&stype=normal");
		HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
		urlconnection.setRequestMethod("POST");
		urlconnection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
		urlconnection.setDoOutput(true);
		OutputStreamWriter out = new OutputStreamWriter(urlconnection.getOutputStream());
		out.write(postData);
		out.close();
		in = new BufferedReader( new
				InputStreamReader(urlconnection.getInputStream()));
		String decodedString;
		while ((decodedString = in.readLine()) != null) {
			retval += decodedString;

		}
		System.out.println(retval);
		in.close();
	}*/
	
	
	


	public static void sendSMSDynamic(String number,String message,String Username1,String Password1,String SenderID1) throws IOException{
		
		URLConnection myURLConnection=null;
		URL myURL=null;
		BufferedReader reader=null;

		//encoding message 
		//String encoded_message=URLEncoder.encode(message);

		//Send SMS API
		//String mainUrl="http://websms.hiideals.com/sendsms.aspx?";
		String mainUrl="http://173.45.76.227/send.aspx?";
		System.out.println("SMS to  number    :  "+number);
		String postData=null;
		String MobileNo = number;
		String Messagenew = message;
		
		//String Username = "8762164645";
		//String Password = "Hiideals@123";
	   //String SenderID = "INFINT";
		
		String Username = Username1;//"8762164645";
		String Password = Password1;//"Hiideals@123";
		String SenderID = SenderID1;//"INFINT";
		String route="trans1";
		
		//http://websms.hiideals.com/sendsms.aspx?mobile=8762164645&pass=Hiideals@123&senderid=INFINT&to=8123939684&msg=Thanks%20for%20contacting%20us%20,%20We%20will%20get%20back%20to%20you%20soon%20for%20your%20Appointment%20Confirmation.
		

		//postData += "APIKey="+apikey+"&senderid=" + SenderID + "&channel=" + TRANS + "&DCS=" +DCS+ "&flashsms="+ flashsms +"&number=" + MobileNo +"&message=" + Message+"&route="+ route;

		//final string
		System.out.println("SMS to  number");
		String url="http://173.45.76.227/send.aspx?username="+Username+"&pass="+Password+"&route="+route+"&senderid="+SenderID+"&numbers="+number+"&message="+message+"";
		//String url="http://websms.hiideals.com/sendsms.aspx?mobile="+Username+"&pass="+Password+"&senderid="+SenderID+"&to="+MobileNo+"&msg="+Messagenew+"";
		String newUrlString = url.replaceAll(" ", "%20");
		
		
		mainUrl = (newUrlString).toString();
		try
		{
			//prepare connection
			myURL = new URL(mainUrl);
			myURLConnection = myURL.openConnection();
			myURLConnection.connect();
			reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
			//reading response 
			String response;
			while ((response = reader.readLine()) != null) 
				//print response 
				System.out.println(response);

			//finally close connection
			reader.close();
		} 
		catch (IOException e) 
		{ 
			e.printStackTrace();
		} 

	}


}

