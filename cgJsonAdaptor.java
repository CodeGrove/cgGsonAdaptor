package net.code_grove.json.gson;
 
import com.google.gson.Gson;
 
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
	  //convert java object to JSON format
	   String json = gson.toJson(sv);
    return json;
  }

  public static cgJsonValues deSerializeJson(String serializedValue)
  {
	   Gson gson = new Gson();
     sv = gson.fromJson(serializedValue, cgJsonValues.class);
     return sv;
  }

  public static void main(String[] args) 
  {
  }
}
