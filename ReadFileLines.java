import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileLines {

	public static void main(String[] args) {
	System.out.println("Java 8 Read File Example with Files.lines() function");
	
	try {
		
	Files.lines(new File("data.txt").toPath())
		.map(s -> s.trim())
		.filter(s -> !s.isEmpty())
		.forEach(System.out::println);
		
	} catch (IOException e) {
		e.printStackTrace();
	}		

	}

}
