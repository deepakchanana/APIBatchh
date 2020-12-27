package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement 
{
 public static String jsonValueReplacement(String body,String variablename,String variableValue)
 {
 body=body.replaceAll(Pattern.quote("{{"+variablename+"}}"),variableValue); 
  return body;
 }
}
