package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3_Get_Request_AllData 
{
@Test(enabled=false)	
public void thirdTC() throws IOException
{
	 Properties p=LoadProperties.properties("../APIFW/URI.properties");
	 HTTPMethods http=new HTTPMethods(p);
	 Response res=http.GetRequest("QA_URI");
     ResponseValidate.statusCodeValidate(200, res);
	 ResponseValidate.dataValidate("Primary Address", res,"[2].addressdetails[0].landmark");
}
}
