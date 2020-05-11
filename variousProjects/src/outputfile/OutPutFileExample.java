package outputfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class OutPutFileExample {
	
	public static void main(String [] args) throws IOException {
//		File file = new File("C:\\zarrar\\java\\Data.txt");
//		FileWriter output = new FileWriter(file)
		Stream.of('0', '1', '2', '3', '4').forEach(System.out::println);
		for ( int i = 0; i< 5; i++) {
			System.out.println((String.valueOf(i)));
		}
		
////		System.out.println(Stream.of("green", "yellow", "blue")
//		.max(s1,s2) -> s1.compareTo(s2)).filter(s->s.endsWith("n").orElse("yellow"));
//		
	}

}
