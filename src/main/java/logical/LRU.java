package logical;

import java.util.ArrayList;

public class LRU {

    // Driver method
    public static void main(String[] args) {
        int capacity = 3;
        int arr[] = {2,1,4,5,7};

        // To represent set of current pages.We use
        // an Arraylist
        ArrayList<Integer> s=new ArrayList<>(capacity);
        int count=0;
        int page_faults=0;
        for(int i:arr)
        {
            // Insert it into set if not present
            // already which represents page fault
            if(!s.contains(i))
            {

                // Check if the set can hold equal pages
                if(s.size()==capacity)
                {
                    s.remove(0);
                    s.add(capacity-1,i);
                }
                else
                    s.add(count,i);
                // Increment page faults
                page_faults++;
                ++count;

            }
            else
            {
                // Remove the indexes page
                s.remove((Object)i);
                // insert the current page
                s.add(s.size(),i);
            }

        }
        System.out.println(s);
    }

}




