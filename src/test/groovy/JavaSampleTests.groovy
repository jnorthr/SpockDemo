// this is a Spock testing framework. Yes it's groovy but we can also use it to test Java and Scala code too !
import spock.lang.*
class JavaSampleTests extends Specification {
  // fields
  def static sample


  // fixture methods
  def "make and remove sample file"(){

	// prepare the environment for a test to take place
	setup:
		def file = new File("testnotes.txt")
		file.createNewFile()

		// ... write one test here

	// teardown environment
	cleanup:	
		file.delete()

  } // end of def

  // Spock permits documenting this particular test in quotes; text appears if this test fails
  def "simple test to invoke JavaSample"(){
	setup:
		JavaSample js = new JavaSample()

	when:
	        js.setName("Fred")

	then:
		// this is what's known as a power assert cos we can put text after assert that appears in test log on failures
		assert js.getName() == "Fred", "String is a name that was stored in this object"  

	cleanup:	
		println "ok, done"
} // end of def

	@Unroll
	def 'Test #test should getName for #data'() 
	{
		def sample = new JavaSample()

		setup:
			sample.setName("Fred")

    		expect:
			// test 1 is ok but 2 & 3 fail as names are not 'Fred'
			assert sample.getName() == data, "getName not as expected"
		where:
		   test | data 
		    1   | "Fred" 
		    2   | "Andy"           
		    3   | "Leanne"            

	} // end of unroll

	@Unroll
	def 'Test #test should keep #data'() 
	{
		def sample = new JavaSample()

		setup:
			sample.setName("Fred")

    		expect:
			// this test fails cos setName does not return a value :)
			assert sample.setName(data) == data, "setName assert failed"
		where:
		   test | data 
		    4   | "Fred" 
		    5   | "Andy"           
		    6   | "Leanne"            

	} // end of unroll

	@Unroll
	def 'Test #test should use groovy.property logic to get name as #data'() 
	{
		setup:		
			def sample = new JavaSample()
			sample.setName("Andy")

    		expect:
			// test 8 works but 7 and 9 fail cos names are not Andy
			assert sample.name == data, "name was not what we expected" 

		where:
		   test | data 
		    7   | "Fred" 
		    8   | "Andy"           
		    9   | "Leanne"            

	} // end of unroll

	@Unroll
	def 'Test #test should use groovy.property logic to get name as #data'() 
	{
		setup:		
			def sample = new JavaSample()
			sample.setName("Leanne");
			
    		expect:
				// this test fails cos setName does not return a value :)
				assert sample.getName() == data, "set/get name was not what we expected" 

		where:
		   test | data 
		    10   | "Fred" 
		    11   | "Andy"           
		    12   | "Leanne"            

	} // end of unroll


  // feature methods

  // helper methods

}