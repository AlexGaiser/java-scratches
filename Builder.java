
import java.util.ArrayList;
import java.util.Locale;

public class StringBuild {
    private ArrayList<String> stringArr = new ArrayList<>();
    
    public StringBuild(String baseString) {
        this.stringArr.add(baseString);
    }

    public StringBuild extend (String str) {
        this.stringArr.add(str);
        return this;
    }

    public StringBuild capitalizeStr () {
        for (int i = 0; i < this.stringArr.size(); i++) {
            String s = this.stringArr.get(i);
            s = s.toUpperCase();
            this.stringArr.set(i, s);
        }
        return this;
    }

    public StringBuild reverseStr () {
        String[] reverseList = new String[this.stringArr.size()];

        for(int i = 0; i < this.stringArr.size(); i++) {
            reverseList[i] = this.stringArr.get(this.stringArr.size()-1 -i);
            System.out.println(reverseList[i]);

        }

        for(int i = 0; i < this.stringArr.size(); i++) {
            this.stringArr.set(i, reverseList[i]);
        }
        return this;
    }

    public String build() {
        return String.join(" ", this.stringArr);
    }
}
