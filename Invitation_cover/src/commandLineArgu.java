import java.util.HashMap;

/**
 * Created by sanjitd on 08/03/16.
 */

public class CommandLineArgu {

    private final String[] arg;

    public CommandLineArgu(String[] args) {
        this.arg = args;
    }
    public HashMap<String, String> createField() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < arg.length; i++)
            if (i % 2 == 0)
                map.put(arg[i], arg[i + 1]);
        return map;
    }
}
