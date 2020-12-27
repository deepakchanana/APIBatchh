package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadProperties;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

import com.jayway.restassured.response.Response;

public class TC2_Get_TestCase
{
 @Test	
 public void testcase2() throws IOException
 {
    Properties p=LoadProperties.properties("../APIFW/URI.properties");
    HTTPMethods http=new HTTPMethods(p);
    Response res=http.GetRequest("QA_URI",TC1_Post_Request.idValue);
    ResponseValidate.statusCodeValidate(200, res);
 }
}
