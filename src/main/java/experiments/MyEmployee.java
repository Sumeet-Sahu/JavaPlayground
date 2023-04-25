package experiments;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
class MyEmployee {

    String name;
    int age;
    Date dob;

    @Override
    public String toString() {
        return "MyEmployee{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

    @Override
    public int hashCode() {
        //return age.hashcode();
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return ((MyEmployee) obj).name == name;
    }
}