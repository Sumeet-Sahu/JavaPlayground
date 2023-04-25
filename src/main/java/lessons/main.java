package lessons;

import java.util.*;

public class main {

    public static void main(String[] args) {

        String profile = "";

        Map<String, List> jobProfiles = new HashMap<String, List>();
        jobProfiles.put("Java Developer", Arrays.asList("Java", "Spring", "Boot", "Micro", "Service"));

        boolean isMatched = false;
        String[] profileDetails = profile.split(",");

        String name = profileDetails[0];
        String jobRole = profileDetails[1];

        List skillsToMatch = jobProfiles.get(jobRole);
        for (int i = 2; i < profileDetails.length; i++) {
            if(skillsToMatch.contains(profileDetails[i])) {
                isMatched = true;
                break;
            }
        }

        if(isMatched) {
            System.out.println();
        }
    }
}
