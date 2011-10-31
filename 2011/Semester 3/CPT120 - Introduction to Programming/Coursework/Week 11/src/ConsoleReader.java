import java.io.*;
public class ConsoleReader {
	public ConsoleReader()
	{
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	private BufferedReader reader;
	
	public int readInt()
	{
		String inputString = readLine();
		int n = Integer.parseInt(inputString);
		return n;
	}
	
	public String readLine()
	{
		String inputLine = "";
		try
		{
			inputLine = reader.readLine();
		
		} catch (IOException e)
		{
			System.out.println(e);
			System.exit(1);
		}
		return inputLine;
	}
}
