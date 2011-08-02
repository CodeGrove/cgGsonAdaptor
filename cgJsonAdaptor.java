package net.code_grove.json.gson;
 
import com.google.gson.Gson;
 
/**
 * @author: Micah Breedlove <Micah@BlueShamrockDev.com> .::. <DruiD@Code-Grove.net>;
 * @package: net.code_grove.json.gson;
 *
 * This adaptor works with gson and handles to and from gson packages for you.
 * The cgJsonValues is a class which represents the values in the json string
 * the cgJsonAdaptor handles the "dirty work" for you.
 *
 *
 * Syntax: 
 *   cgJsonAdaptor json = new cgJsonAdaptor(new cgJsonValues);
 *
 * www.code-grove.net
 *
 **/
 
public class cgJsonAdaptor 
{
  public static cgJsonValues sv;

  public cgJsonAdaptor()
  {
     sv = new cgJsonValues();
  }

  public cgJsonAdaptor(cgJsonValues incoming)
  {
     sv = incoming;
  }


  public static String getJson()
  {
	   Gson gson = new Gson();
	  // convert java object to JSON format
	   String json = gson.toJson(sv);
    // return json encoded String
    return json;
  }

  public static cgJsonValues deSerializeJson(String serializedValue)
  {
	   Gson gson = new Gson();
     // decode json string into a populated  cgJsonValues file
     sv = gson.fromJson(serializedValue, cgJsonValues.class);
     // return a cgJsonValues object
     return sv;
  }

}
