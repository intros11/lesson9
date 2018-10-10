package lesson9;

import java.lang.ref.SoftReference;
import java.sql.Statement;
import java.util.Arrays;

public class UserRepository {
    private User[] users;
    String[] userNames;
    int[]  userIds;
    String userNameById;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public String[] getUserNames() {
        return userNames;
    }

    public int[] getUserIds() {
        return userIds;
    }

    public String getUserNameById(long id) {
                return userNameById;
    }
}
