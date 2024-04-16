import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Create a Map to store the frequency of each string in 'strings'
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each string in 'strings'
        for (String str : strings) {
            if (frequencyMap.containsKey(str)) {
                frequencyMap.put(str, frequencyMap.get(str) + 1);
            } else {
                frequencyMap.put(str, 1);
            }
        }

        // Create a list to store the results
        List<Integer> result = new ArrayList<>();

        // Count occurrences of each query in 'queries' using the frequencyMap
        for (String query : queries) {
            if (frequencyMap.containsKey(query)) {
                result.add(frequencyMap.get(query));
            } else {
                result.add(0);
            }
        }

        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = bufferedReader.readLine();
            strings.add(stringsItem);
        }

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = bufferedReader.readLine();
            queries.add(queriesItem);
        }

        List<Integer> res = Result.matchingStrings(strings, queries);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();


        bufferedReader.close();
        bufferedWriter.close();
    }
}
