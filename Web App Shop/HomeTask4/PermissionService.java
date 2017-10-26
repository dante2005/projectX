package HomeTask4;

import java.io.IOException;

public interface PermissionService {

    boolean authenticate(User user) throws IOException;
}
