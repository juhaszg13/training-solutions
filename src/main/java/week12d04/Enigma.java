package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma {
    public void printSecret(Path path) {

        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b : bytes) {
                char c = (char) (b + 10);
                System.out.print(c);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot open file", e);
        }
    }

    public String printSecret2(Path path) {
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b : bytes) {
                char c = (char) (b + 10);
                sb.append(c);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot open file", e);
        }
        return sb.toString();
    }
    public String printSecret3(Path path) {
        StringBuilder sb = new StringBuilder();
        try (InputStream is=Files.newInputStream(path)){
            byte[] buffer=new byte[1000];
            int size;
            while((size=is.read(buffer))>0) {
                for (int i=0;i<size;i++) {
                    char c = (char) (buffer[i] + 10);
                    sb.append(c);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot open file", e);
        }
        return sb.toString();
    }
    public void printSecret4(Path source, Path target) {
        try (InputStream is=Files.newInputStream(source)){
            OutputStream os=Files.newOutputStream(target);
            byte[] buffer=new byte[1000];
            int size;
            while((size=is.read(buffer))>0) {
                for (int i=0;i<size;i++) {
                    char c = (char) (buffer[i] + 10);
                    os.write(c);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot open file", e);
        }
    }
    public void printSecret5(Path source, Path target) {
        try (InputStream is=Files.newInputStream(source)){
            Writer os=Files.newBufferedWriter(target);
            byte[] buffer=new byte[1000];
            int size;
            while((size=is.read(buffer))>0) {
                for (int i=0;i<size;i++) {
                    char c = (char) (buffer[i] + 10);
                    os.write(Character.toString(c));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot open file", e);
        }
    }

    public static void main(String[] args) {
        new Enigma().printSecret(Path.of("secret.dat"));
        String result = new Enigma().printSecret2(Path.of("secret.dat"));
        System.out.println(result);
        String result2 = new Enigma().printSecret3(Path.of("secret.dat"));
        System.out.println(result2);
        new Enigma().printSecret4(Path.of("secret.dat"),Path.of("result.txt"));
        new Enigma().printSecret4(Path.of("secret.dat"),Path.of("result2.txt"));

    }
}
