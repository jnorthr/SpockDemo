public class JavaSample {
    String name = "";

    public String getName()
    {
	return this.name;
    }

    public void setName(String name)
    {
	this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("JavaSample");
		JavaSample js = new JavaSample();
		js.setName("World");
        System.out.println("Hello "+js.getName());
		assert js.getName()=="World";
    } // end of main

} // end of class
