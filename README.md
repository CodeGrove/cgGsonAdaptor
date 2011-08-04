# **cgJsonAdaptor package** # 
## *net.code\_grove.json.gson* ##  
---
**Contact Email**: druid@code-grove.net  
**Requirements**: [gson Libraries](http://code.google.com/p/google-gson/)  
**Reason for package**:  
  I had an Android project I was working on which requried some json data and after fighting  
  with it for a few hours I decided gson would be the best route to take. I quickly realized  
  I was replicating the same steps in code over and over so I decided to take a step out and  
  do something about it. The contents of this package include:  
1. cgJsonAdaptor - the actual file handling the json/gson manipulation  
2. cgJsonValuesBASE - the customizable Base class which allows you to set your json values and their getters and setters  
3. cgJsonValues - an extention of the Base Json Values class which is where any project specific data manipulation would go 
**Author's Note**: I hope that at least someone finds this useful. I know I did ;)   

**Usage**:  
     // // Encoding
     // instantiate Values class
     cgJsonValues obj = new cgJsonValues();
     // define values
        obj.setName("Code Grove");
        obj.setTree1("Oak");
        obj.setTree2("Redwood");
        obj.setTree3("Java");
     cgJsonAdaptor json = new cgJsonAdaptor(obj);
     String blah = json.getJson(); 
     System.out.println(blah); 
     // output: {"savedValues":"","name":"Code Grove","tree1":"Oak","tree2":"Redwood","tree3":"Java"}`

     // // Decoding
     cgJsonValues decoded = json.deSerializeJson(blah);
     System.out.println(decoded.getName()); // output: Code Grove
     System.out.println(decoded.getTree1()); // output: Oak
     System.out.println(decoded.getTree3()); // output: Java
