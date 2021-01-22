package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {
    private List<Integer> numbers=new ArrayList<>();

    public int findSmallestUnique() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Empty list");
        }
        List<Integer> sortedNumber = new ArrayList<>(numbers);
        Collections.sort(sortedNumber);
        if (numbers.size() == 1) {
            return numbers.get(0);
        }

        if (sortedNumber.get(0) != sortedNumber.get(1)) {
            return sortedNumber.get(0);
        }
        for (int i = 1; i < sortedNumber.size() - 1; i++) {
            if (sortedNumber.get(i) != sortedNumber.get(i - 1) && sortedNumber.get(i) != sortedNumber.get(i + 1)) {
                return sortedNumber.get(i);
            }
            if (sortedNumber.get(sortedNumber.size() - 2) != sortedNumber.get(sortedNumber.size() - 1)) {
                return sortedNumber.get(sortedNumber.size() - 1);
            }
        }
        throw new IllegalStateException("Wrong list!");
    }

    public void readFromFile(String fileName) {
        Path path = Path.of(fileName);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                addLine(temp);
            }
        } catch (NoSuchFileException nsfe) {
            throw new IllegalArgumentException("Cannot find file!");
        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong!", ioe);
        }
    }

    public void addLine(String[] temp) {
        for (String s : temp) {
            numbers.add(Integer.parseInt(s));
        }
    }


    public List<Integer> getNumbers() {
        return numbers;
    }
}
