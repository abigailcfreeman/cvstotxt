import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HelloFile {



    public static void main(String[] args) throws IOException {


        File file = new File("oscar_age_female.csv");
        Scanner scanner = new Scanner(file);
        System.out.println("now we are reading from " + file);
        String data = scanner.nextLine();
        while (scanner.hasNextLine()) {
            data = scanner.nextLine();
           var line =data.split(", ");
            String test = " Year: " + line[1] + "\n " + "Age: " +  line[2] + "\n " + "Name :" + line[3] + "\n " + "Movie: " + line[4] + "\n" + "==================" + "\n";
            write(test);
        }
scanner.close();

      //  write(data);

    }



    private static void write(String data) throws IOException {
        //indicate the target file to write on
        FileWriter writer = new FileWriter("result.txt", true);

        //write

        writer.write(data);

        //clean up

        writer.close();
    }


}
