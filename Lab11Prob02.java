import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab11Prob02 {
	public static void main(String[] args)  {
		String input = "src/people.dat";		// Creates the input and output fields.
		String output = "src/people-copy.dat";
		try(
				
		DataInputStream input1 = new DataInputStream(new FileInputStream(input));	// creates data input and output stream for file.
		DataOutputStream output1 = new DataOutputStream(new FileOutputStream(output));
		) {
			while(true) {					// while loop that reads the file and then writes to the output file.
				int age = input1.readInt();
				String name = input1.readUTF();
				String address = input1.readUTF();
				int zipCode = input1.readInt();
				double salary = input1.readDouble();
				
				output1.writeInt(age);
				output1.writeUTF(name);
				output1.writeUTF(address);
				output1.writeInt(zipCode);
				output1.writeDouble(salary);
				
			System.out.printf("%d %s %s %d %.2f%n", age, name, address, zipCode, salary);	// prints the formatted output of the file.
			
		
			}
			} catch (EOFException e) {
				
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
	}}


