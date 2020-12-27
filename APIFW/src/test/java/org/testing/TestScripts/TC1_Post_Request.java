package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.LoadJsonPayload;
import org.testing.utilities.LoadProperties;
import org.testing.utilities.ParsingJsonUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

// Post request------> body------->from a json file
public class TC1_Post_Request
{
	static String idValue;	
  @Test	
  public void testcase1() throws IOException
  {
	 Random random=new Random();
	 Integer id=random.nextInt();
	Properties pr=  LoadProperties.properties("../APIFW/URI.properties");
	String body=LoadJsonPayload.loadJson("../APIFW/src/test/java/org/testing/Payloads/body.json");
	body=JsonReplacement.jsonValueReplacement(body,"id",id.toString());
	
	HTTPMethods http=new HTTPMethods(pr);
	Response res=http.postRequest(body,"QA_URI");
	idValue=ParsingJsonUsingJsonPath.parseJson(res, "id");
	System.out.println("id is "+idValue);
	
	ResponseValidate.statusCodeValidate(201, res);
	
  }

}
