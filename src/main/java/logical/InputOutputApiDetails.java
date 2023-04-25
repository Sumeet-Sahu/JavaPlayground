package logical;


/* Save this in a file called Main.java to compile and test it */

/* 
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */

import java.io.*;
import java.util.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class InputOutputApiDetails {

    static Map<String, Integer> latestApiVersions = new HashMap<>();
    static Map<String, HashMap<String, Integer>> appAPIVersionDetails = new HashMap<>();
    static Set<String> outDatedApps = new HashSet<>();

    public static void main(String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        int numLines = 0;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("src/input.txt")));

            /* Here we can read in the input file */
            /* In this example, we're reading all the lines of file
               `input.txt` and then ignoring them.
               You should modify this part of the
               program to read and process the input as desired */
            while (in.hasNextLine()) {
                String line = in.nextLine();
                if (!line.isEmpty())
                    readAndStoreDetails(line);
                numLines++;
            }

            /* In this example, we're writing `num_lines` to
               the file `output.txt`.
               You should modify this part of the
               program to write the desired output */
            System.out.println(outDatedApps);

            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + numLines);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }

    private static void readAndStoreDetails(String line) {
        //Sample: MAil, Auth API, V6
        StringTokenizer tokenizer = new StringTokenizer(line, ",");
        String app = tokenizer.nextToken();
        String api = tokenizer.nextToken();
        Integer version = Integer.parseInt(tokenizer.nextToken().substring(2));

        indexAppAndAPIDetails(app, api, version);

    }

    private static void indexAppAndAPIDetails(String app, String api, Integer version) {
        storeLatestAPIDetails(api, version);
        storeAppAPIDetails(app, api, version);
        checkIfAnyAppBecameOutdated();
    }

    private static void checkIfAnyAppBecameOutdated() {
        for(String app: appAPIVersionDetails.keySet()){
            checkIfAppIsOutdated(app);
        }
    }

    private static void checkIfAppIsOutdated(String app) {
        boolean isAppOutdated = false;
        if(appAPIVersionDetails.get(app) != null){
            isAppOutdated = checkIfAnyApiIsOutdated(appAPIVersionDetails.get(app).entrySet());
        }

        if(isAppOutdated){
            outDatedApps.add(app);
        }
    }

    private static boolean checkIfAnyApiIsOutdated(Set<Map.Entry<String,Integer>> apis) {
        for(Map.Entry<String,Integer> api : apis){
            if(latestApiVersions.get(api.getKey()) > api.getValue())
                return true;
        }
        return false;
    }

    private static void storeAppAPIDetails(String app, String api, Integer version) {
        if (appAPIVersionDetails.get(app) == null) {
            HashMap<String, Integer> apiAndVersions = new HashMap<>();
            apiAndVersions.put(api, version);
            appAPIVersionDetails.put(app, apiAndVersions);
        } else {
            appAPIVersionDetails.get(app).put(api, version);
        }

    }

    private static void storeLatestAPIDetails(String api, Integer version) {
        Integer existingVersion = latestApiVersions.get(api);
        latestApiVersions.put(api, existingVersion != null ? returnGreaterVersion(existingVersion, version) : version);
    }

    private static Integer returnGreaterVersion(Integer existingVersion, Integer version) {
        return existingVersion > version ? existingVersion : version;
    }

}
