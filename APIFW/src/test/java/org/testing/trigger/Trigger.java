package org.testing.trigger;

import java.io.IOException;

import org.testing.TestScripts.TC1_Post_Request;
import org.testing.TestScripts.TC2_Get_TestCase;
import org.testing.TestScripts.TC3_Get_Request_AllData;

public class Trigger
{
 public static void main(String[] args) throws IOException
 {
  TC3_Get_Request_AllData tc3=new TC3_Get_Request_AllData();
  tc3.thirdTC();
  
 }
}
