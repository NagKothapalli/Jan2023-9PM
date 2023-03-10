package multilevelInheritance;

public class ReusableComponents 
{	
	//******************** Reusable Components *********************
	void launchApplication()
	{
		System.out.println("RC : Launch Application");
	}
	protected void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	protected void logoutFromApplication()
	{
		System.out.println("RC : Login To Application");
	}
	void closeApplication()
	{
		System.out.println("RC : Login To Application");
	}
	
	protected void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");
	}
	public void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply Mail");
	}
	void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}
	
}
