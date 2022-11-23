import java.io.*;
class Runtimedemo
{
	 public static   void main(String args[])  throws IOException
	{
		try
		{
			Runtime rt=Runtime.getRuntime();

			Thread.sleep(5000);
			Process p1= rt.exec("calc.exe");

			Thread.sleep(5000);
			Process p2= rt.exec("notepad.exe");

			Thread.sleep(5000);
			Process p3= rt.exec("mspaint.exe");

			Thread.sleep(5000);
			p3.destroy();

			Thread.sleep(5000);
			p2.destroy();

			Thread.sleep(5000);
			p1.destroy();	
		}
		catch(Exception e ){}
	}
}
