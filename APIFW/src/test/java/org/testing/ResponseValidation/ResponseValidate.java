package org.testing.ResponseValidation;

import org.testing.utilities.ParsingJsonUsingJsonPath;

import com.jayway.restassured.response.Response;

public class ResponseValidate
{
   public static void statusCodeValidate(int expectedStatusCode,Response res)
   {
	   if(expectedStatusCode==res.getStatusCode())
	   {
		   System.out.println("Status code is matching ");
	   }
	   else
	   {
		   System.out.println("Status Code is not matching");
	   }
   }
   
   public static void dataValidate(String expectedData,Response res,String jsonpath)
   {
	   if(expectedData.equals(ParsingJsonUsingJsonPath.parseJson(res, jsonpath)))
	   {
		   System.out.println("Data is matching ");
	   }
	   else
	   {
		   System.out.println("Data is not matching");
	   }
   }
	
}
